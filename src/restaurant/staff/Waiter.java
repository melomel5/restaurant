package restaurant.staff;

import restaurant.Customer;
import restaurant.Hall;
import restaurant.menu.Dish;
import restaurant.order.Order;

public class Waiter extends Staff {

    private Hall hall;

    public Waiter() {
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void seatCustomer(Customer customer, int tableNumber) {
        hall.seatCustomer(customer, tableNumber);
    }

    public void serveOrder(Order order, int tableNumber) {
        String message = tableNumber != -1
                ? "Waiter is serving order to table #" + tableNumber
                : "Waiter is serving order for takeaway";

        if (order.isReady()) {
            System.out.println(message + ". Your order is ready. Your list of dishes: ");
            for (Dish dish : order.getDishes()) {
                System.out.println(" - " + dish.getName());
            }
        } else {
            System.out.println("Waiter cannot serve the order yet. Please wait until it is ready.");
        }
    }
}