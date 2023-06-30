package restaurant.order;

import static restaurant.menu.DishType.BAR;

import restaurant.bar.Bar;
import restaurant.kitchen.Kitchen;
import restaurant.menu.Dish;
import restaurant.staff.BartenderImpl;
import restaurant.staff.Chef;
import restaurant.staff.ColdKitchenChef;
import restaurant.staff.HotKitchenChef;
import restaurant.staff.interfaces.Cook;

public class OrderProcessor {
    private Kitchen kitchen;
    private Bar bar;
    private BartenderImpl bartender;
    private Cook coldKitchenChef;
    private Cook hotKitchenChef;
    private Cook chef;

    public OrderProcessor() {
        coldKitchenChef = new ColdKitchenChef();
        hotKitchenChef = new HotKitchenChef();
        chef = new Chef();
        bartender = new BartenderImpl();
        kitchen = new Kitchen(coldKitchenChef, hotKitchenChef, chef);
        bar = new Bar(bartender);
    }

    public void processOrder(Order order) {
        for (Dish dish : order.getDishes()) {
            if (dish.getType().equals(BAR)) {
                bar.prepareCocktail(dish);
            } else {
                kitchen.prepareDish(dish);
            }
        }
        order.setReady(true);
    }
}
