public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIcebox().setHasWorkTDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIcebox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        // Test 1 --> Coffee and Dishes
        System.out.println("Test 1: Coffee and Dishes");
        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

        // Test 2 --> Only Fridge
        System.out.println("\nTest 2: Only Fridge");
        kitchen.setKitchenState(false, true, false);
        kitchen.doKitchenWork();

        // Test 3 --> All Appliances
        System.out.println("\nTest 3: All Appliances");
        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

    }
}
