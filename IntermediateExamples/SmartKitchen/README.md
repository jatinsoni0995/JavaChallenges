# SmartKitchen
Java project demonstrating composition and OOP for a smart kitchen system. Controls `CoffeeMaker`, `DishWasher`, and `Refrigerator` appliances to automate tasks like brewing coffee, washing dishes, and ordering food.

## Features
- **Composition**: `SmartKitchen` manages multiple appliance objects.
- **Flexible Constructors**: No-args and parameterized constructors.
- **Centralized Control**: `setKitchenState` and `doKitchenWork` methods for task automation.
- **Error Handling**: Null checks and try-catch for robustness.

## Usage
Run `Main.java`
SmartKitchen kitchen = new SmartKitchen();
kitchen.setKitchenState(true, false, true);
kitchen.doKitchenWork(); 
