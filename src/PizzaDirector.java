import java.util.*;
public class PizzaDirector {
    public Pizza buildPizza(PizzaBuilder builder, List<String> toppings, String size, String store){
        builder.setStore(store);
        builder.setSize(size);
        for (String topping : toppings) {
            builder.addToppings(topping);
        }
        return builder.getPizza();
    }
}
