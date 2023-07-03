package restaurant.kitchen;

import java.util.List;

import restaurant.menu.Dish;
import restaurant.staff.interfaces.Cook;

public class Kitchen {

    private List<Cook> cooks;

    public Kitchen(List<Cook> cooks) {
        this.cooks = cooks;
    }

    public void prepareDish(Dish dish) {
        for (Cook cook : cooks) {
            if (cook.canCook(dish.getType())) {
                cook.cook(dish.getName(), dish.getIngredients());
                return;
            }
        }
        System.out.println("No suitable cook found for the dish: " + dish.getName());
    }
}
