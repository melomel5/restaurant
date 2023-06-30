package restaurant.kitchen;

import restaurant.menu.Dish;
import restaurant.staff.interfaces.Cook;

public class Kitchen {
    private Cook coldKitchenChef;
    private Cook hotKitchenChef;
    private Cook chef;

    public Kitchen(Cook coldKitchenChef, Cook hotKitchenChef, Cook chef) {
        this.coldKitchenChef = coldKitchenChef;
        this.hotKitchenChef = hotKitchenChef;
        this.chef = chef;
    }

    public void prepareDish(Dish dish) {
        switch (dish.getType()) {
        case COLD:
        case DESSERT:
            coldKitchenChef.cook(dish.getName(), dish.getIngredients());
            break;
        case HOT:
            hotKitchenChef.cook(dish.getName(), dish.getIngredients());
            break;
        case UNKNOWN:
            chef.cook(dish.getName(), dish.getIngredients());
            break;
        default:
            System.out.println("Invalid dish type.");
        }
    }
}
