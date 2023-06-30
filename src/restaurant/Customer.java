package restaurant;

import java.util.List;
import java.util.Scanner;

import restaurant.menu.Dish;
import restaurant.menu.RestaurantMenu;
import restaurant.order.Order;

public class Customer {

    private String name;
    private Order order;
    private Table table;
    private Hall hall;
    private int tableNumber;

    public Customer(String name, Hall hall) {
        this.name = name;
        this.hall = hall;
        this.tableNumber = -1;
        this.order = new Order();
        this.table = new Table(tableNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeASit(int tableNumber) {
        if (hall.isTableOccupied(tableNumber)) {
            System.out.println("Impossible seat to table is #" + tableNumber);
        } else {
            this.tableNumber = tableNumber;
            System.out.println("Your current table is #" + tableNumber);
        }
    }

    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of dishes you want to order:");
        int quantity = scanner.nextInt();
        RestaurantMenu menu = new RestaurantMenu();
        menu.showMenu();

        for (int i = 1; i <= quantity; i++) {
            System.out.print("Input the name of the dish #" + i + ": ");
            String dishName = scanner.next();

            Dish dish = menu.getDishByName(dishName);
            if (dish != null) {
                order.addDish(dish);
            } else {
                System.out.println("Invalid dish name. Please try again.");
                i--;
            }
        }

        scanner.close();
    }

    public void showOrder() {
        System.out.println("Your order:");
        List<Dish> dishes = order.getDishes();
        for (Dish dish : dishes) {
            System.out.println(" - " + dish.getName());
        }
    }

    public Order getOrder() {
        return order;
    }

    public int getTableNumber() {
        return table.getNumber();
    }
}
