public interface PizzaBuilder {
    void addToppings(String topping);
    void setSize(String size);
    void setStore(String store);
    Pizza getPizza();
}
