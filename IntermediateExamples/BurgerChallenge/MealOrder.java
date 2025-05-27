package BurgerChallenge;

public class MealOrder  {

    private Burger burger;
    private Item drink;
    private Item side;

    // Constructor to setup a default meal
    public MealOrder(){
        this("regular","coke","fries");
    }

    //Encapsulation
    public MealOrder(String burgerType, String drinkType, String sideType){

        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType,8.5);
        }else{
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.0);
        this.side = new Item("side",sideType,1.50);
    }

    public double getTotalPrice(){

        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return drink.getAdjustedPrice() + side.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){

        burger.printItem();
        // If it's a deluxe burger, the price of the supplementary items = 0
        if(burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(),0);
            Item.printItem(side.getName(),0);
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("GRAND TOTAL:",getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    // If burger is deluxe burger, 5 extra toppings are allowed
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3);
        }else{
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
