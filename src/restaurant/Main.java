package restaurant;

import restaurant.order.OrderProcessor;
import restaurant.staff.Waiter;

public class Main {

    public static void main(String[] args) {

        Hall hall = new Hall();
        Waiter waiter = new Waiter();
        OrderProcessor orderProcessor = new OrderProcessor();
        
        Customer serhii = new Customer("Serhii");

        hall.seatCustomer(serhii, 1);

        serhii.placeOrder();
        serhii.showOrder();
        orderProcessor.processOrder(serhii.getOrder());
        waiter.serveOrder(serhii.getOrder(), serhii.getTableNumber());
    }
}