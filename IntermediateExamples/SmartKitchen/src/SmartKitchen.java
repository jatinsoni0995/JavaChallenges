public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator icebox;

    // No-args constructor --> Initializes default appliances
    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        icebox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    // Parameterized Constructor --> Allows custom appliances to be passed
    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator icebox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.icebox = icebox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

//    public void addWater() {
//        if (brewMaster != null) brewMaster.setHasWorkToDo(true);
//    }
//
//    public void pourMilk() {
//        if (icebox != null) icebox.setHasWorkToDo(true);
//    }
//
//    public void loadDishwasher() {
//        if (dishWasher != null) dishWasher.setHasWorkToDo(true);
//    }

    // Creating a single method in place of all the 3 methods above --> Set work stage for all appliances
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        if (brewMaster != null)
            brewMaster.setHasWorkToDo(coffeeFlag);
        if (icebox != null) 
            icebox.setHasWorkToDo(fridgeFlag);
        if (dishWasher != null)
            dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        try {
            if (brewMaster != null) brewMaster.brewCoffee();
            if (icebox != null) icebox.orderFood();
            if (dishWasher != null) dishWasher.doDishes();
        } catch (Exception e) {
            System.out.println("Error in kitchen work: " + e.getMessage());
        }
    }
}

class CoffeeMaker {

    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Coffee is being brewed");
            hasWorkToDo = false; // Reset after work
        }
    }
}

class DishWasher {

    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes are being washed");
            hasWorkToDo = false; // Reset after work
        }
    }
}

class Refrigerator {

    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false; // Reset after work
        }
    }
}

