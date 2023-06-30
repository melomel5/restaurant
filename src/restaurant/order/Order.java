package restaurant.order;

import java.util.ArrayList;
import java.util.List;

import restaurant.menu.Dish;

public class Order {

    private boolean ready;
    private List<Dish> dishes;

    public Order() {
        dishes = new ArrayList<>();
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
