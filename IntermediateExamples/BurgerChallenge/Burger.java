package BurgerChallenge;

public class Burger extends Item{

    // A drink and a side dish, both are types of items and extra toppings for the burger
    // extra used for toppings, I consider max. 3 toppings for a burger here
    private Item extra1;
    private Item extra2;
    private Item extra3;

    // Encapsulation
    public Burger(String name, double price) {
        super("BURGER", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() +
                ((extra1==null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2==null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3==null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){

        return switch(toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "MUSHROOM" -> 1.5;
            case "HAM", "SALAMI", "BACON" -> 2.0;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){

        this.extra1 = new Item("Toppings", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Toppings", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("Toppings", extra3, getExtraPrice(extra3));
    }
    // Method to itemize extra toppings

    public void printItemizedList(){

        printItem("BASE BURGER ",getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    public void printItem(){
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
