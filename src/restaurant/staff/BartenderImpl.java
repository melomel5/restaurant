package restaurant.staff;

import java.util.List;

import restaurant.staff.interfaces.Bartender;

public class BartenderImpl extends Staff implements Bartender {

    @Override
    public void makeACocktail(String dishName, List<String> ingredients) {
        System.out.println("Bartender is making a cocktail " + dishName);
        System.out.println("Ingredients: " + ingredients);
    }
}
