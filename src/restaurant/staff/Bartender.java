package restaurant.staff;

import java.util.List;

public class Bartender extends Staff {

    public void makeACocktail(String dishName, List<String> ingredients) {
        System.out.println("Bartender is making a cocktail " + dishName);
        System.out.println("Ingredients: " + ingredients);
    }
}
