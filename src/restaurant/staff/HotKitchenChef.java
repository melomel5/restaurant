package restaurant.staff;

import java.util.List;

import restaurant.staff.interfaces.Cook;

public class HotKitchenChef extends Staff implements Cook {

    @Override
    public void cook(String dishName, List<String> ingredients) {
        System.out.println("Hot Kitchen Chef is cooking " + dishName);
        System.out.println("Ingredients: " + ingredients);
    }
}
