package restaurant.order;

import static restaurant.menu.DishType.DRINK;

import java.util.ArrayList;
import java.util.List;

import restaurant.bar.Bar;
import restaurant.kitchen.Kitchen;
import restaurant.menu.Dish;
import restaurant.staff.Bartender;
import restaurant.staff.Chef;
import restaurant.staff.ColdKitchenChef;
import restaurant.staff.HotKitchenChef;
import restaurant.staff.interfaces.Cook;

public class OrderProcessor {
    private Kitchen kitchen;
    private Bar bar;
    private Bartender bartender;
    private List<Cook> cooks;

    public OrderProcessor() {
        bartender = new Bartender();
        cooks = new ArrayList<>();
        cooks.add(new ColdKitchenChef());
        cooks.add(new HotKitchenChef());
        cooks.add(new Chef());
        kitchen = new Kitchen(cooks);
        bar = new Bar(bartender);
    }

    public void processOrder(Order order) {
        for (Dish dish : order.getDishes()) {
            if (dish.getType().equals(DRINK)) {
                bar.prepareCocktail(dish);
            } else {
                kitchen.prepareDish(dish);
            }
        }
        order.setReady(true);
    }
}
