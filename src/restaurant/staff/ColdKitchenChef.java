package restaurant.staff;

import java.util.List;

import restaurant.staff.interfaces.Cook;

public class ColdKitchenChef extends Staff implements Cook {

    @Override
    public void cook(String dishName, List<String> ingredients) {
        System.out.println("Cold Kitchen Chef is cooking " + dishName);
        System.out.println("Ingredients: " + ingredients);
    }
}
