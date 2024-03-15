import java.util.List;
public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        PizzaBuilder builderSmall = new GenericPizza();
        PizzaBuilder builderMedium = new GenericPizza();
        PizzaBuilder builderLarge = new GenericPizza();
        PizzaBuilder littleCaesarsBuilder = new GenericPizza();
        PizzaBuilder pizzaHutBuilder = new GenericPizza();
        PizzaBuilder dominosBuilder = new GenericPizza();

        Pizza pizzaHutSmall = director.buildPizza(builderSmall, List.of("Spicy Pork", "Tomato and Basil"), "Small", "Pizza Hut");
        Pizza pizzaHutMedium = director.buildPizza(builderMedium, List.of("Tomato and Basil", "Bacon", "Spinach", "Spicy Pork", "Olives", "Pepperoni"), "Medium", "Pizza Hut");
        Pizza pizzaHutLarge = director.buildPizza(builderLarge, List.of("Pepperoni", "Onions", "Ham", "Extra Cheese", "Sausage", "Chicken", "Pesto", "Extra Cheese"), "Large", "Pizza Hut");
        pizzaHutSmall.eat();
        pizzaHutMedium.eat();
        pizzaHutLarge.eat();

        Pizza largePizzaHut = director.buildPizza(pizzaHutBuilder, List.of("Chicken", "Pesto", "Extra Cheese"), "Large", "Pizza Hut");
        Pizza smallPizzaHut = director.buildPizza(pizzaHutBuilder, List.of("Chicken", "Pesto"), "Small", "Pizza Hut");
        largePizzaHut.eat();
        smallPizzaHut.eat();

        Pizza mediumLittleCaesars = director.buildPizza(littleCaesarsBuilder, List.of("Sausage", "Peppers", "Ham and Pineapple", "Onions", "Bacon", "Spinach", "Beef", "Chicken"), "Medium", "Little Ceasers");
        Pizza smallLittleCaesars = director.buildPizza(littleCaesarsBuilder, List.of("Tomato and Basil", "Bacon", "Spinach", "Spicy Pork", "Olives", "Pepperoni"), "Small", "Little Ceasers");
        mediumLittleCaesars.eat();
        smallLittleCaesars.eat();

        Pizza smallDominos = director.buildPizza(dominosBuilder, List.of("Bacon"), "Small", "Domino's");
        Pizza largeDominos = director.buildPizza(dominosBuilder, List.of("Bacon", "Spinach", "Spicy Pork"), "Large", "Domino's");
        smallDominos.eat();
        largeDominos.eat();

    }
}
