package restaurant.menu;

import java.util.List;

public class Dish {
    private String name;
    private double price;
    private DishType type;
    private List<String> ingredients;

    public Dish(String name, double price, DishType type, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DishType getType() {
        return type;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
