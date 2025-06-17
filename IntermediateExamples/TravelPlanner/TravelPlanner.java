import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place Anoopshahr = new Place("Anoopshahr", 45);
        addToPlace(placesToVisit,Anoopshahr);
        addToPlace(placesToVisit,new Place("anoopshahr", 45)); // To check if duplicated allowed or not
        addToPlace(placesToVisit,new Place("Sikandrabad", 22));
        addToPlace(placesToVisit,new Place("Dadri", 40));
        addToPlace(placesToVisit,new Place("Ghaziabad", 52));
        addToPlace(placesToVisit,new Place("Noida", 50));
        addToPlace(placesToVisit,new Place("Delhi", 75));
        addToPlace(placesToVisit,new Place("Budaun", 148));

        placesToVisit.addFirst(new Place("Bulandshahr",0));

        System.out.println(placesToVisit);

        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        var iterator = placesToVisit.listIterator();

        while(!quitLoop){

            // Checking if the hasPrevious() method returns false, this means we are at the start of the list
            if(!iterator.hasPrevious()){
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            // If this is false, it means we are at the end of the list
            if(!iterator.hasNext()){
                // Print out the element just up from the cursor using the previous() method
                System.out.println("Final: " + iterator.previous());
                forward = false; // forward is false because we can only go in backward direction now
            }

            System.out.println("Enter Value: ");
            String listItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch(listItem) {

                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){ // Reversing Direction (if forward is false, this means we're moving backwards)
                        forward = true; // set forward to true if it's false, because the user has entered F to move forward
                        if(iterator.hasNext()){
                            iterator.next(); // Adjust Position forward
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward){ // Reversing Direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous(); // Adjust Position backwards
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    private static void addToPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Duplicate found: " + place);
            return;
        }
        for(Place p: list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Duplicate found: " + place);
                return;
            }
        }

        int index = 0;
        for(Place p: list){
            // If the distance for the place we're trying to add to the list is less than the distance in the element we are currently looking at in the loop
            // If it is less, we want to add it here
            if(place.distance() < p.distance()){
                list.add(index,place);
                return;
            }
            index++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available Options (Select word or letter):
                (F)orward
                (B)ackwards
                (L)ist
                (M)enu
                (Q)uit""");
    }
}
record Place(String name, int distance){

    @Override
    public @NotNull String toString() {
        return String.format("%s (%d)", name, distance);
    }
}