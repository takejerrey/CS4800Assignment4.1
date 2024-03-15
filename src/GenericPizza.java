public class GenericPizza implements PizzaBuilder {
    private Pizza pizza;

    public GenericPizza() {
        pizza = new Pizza();
    }

    @Override
    public void addToppings(String topping) {
        if (!pizza.addTopping(topping)) {
            System.out.println("Can not add " + topping + " topping.");
        }
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setStore(String store) {
        pizza.setStore(store);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}