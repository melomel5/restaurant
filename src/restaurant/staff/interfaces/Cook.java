package restaurant.staff.interfaces;

import java.util.List;

import restaurant.menu.DishType;

public interface Cook {
    void cook(String dishName, List<String> ingredients);

    boolean canCook(DishType dishType);
}
