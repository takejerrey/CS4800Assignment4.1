import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Pizza {
    private String store;

    private String size;
    private List<String> toppings;

    private static final String[] allToppings = {"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
            "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
            "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"};

    Pizza() {
        store = "";
        size = "";
        toppings = new ArrayList<>();
    }

    public boolean addTopping(String topping) {
        for (int i  = 0; i < allToppings.length; i++) {
            if (allToppings[i].equals(topping)) {
                toppings.add(topping);
                return true;
            }
        }
        System.out.println( "Sorry but we do not have " + topping + " as a topping.");
        return false;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getStore() {
        return store;
    }

    public void eat() {
        System.out.println("Eating a " + size + " pizza made at " + store + " with " + String.join(", ", toppings) + " toppings.");
    }


}
