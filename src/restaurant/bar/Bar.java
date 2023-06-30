package restaurant.bar;

import restaurant.menu.Dish;
import restaurant.menu.DishType;
import restaurant.staff.BartenderImpl;

public class Bar {
    private BartenderImpl bartender;

    public Bar(BartenderImpl bartender) {
        this.bartender = bartender;
    }

    public void prepareCocktail(Dish cocktail) {
        if (cocktail.getType() != DishType.BAR) {
            System.out.printf("Impossible to prepare %s at the bar, because it is %s ", cocktail.getName(), cocktail.getType());
        } else {
            bartender.makeACocktail(cocktail.getName(), cocktail.getIngredients());
        }
    }
}
