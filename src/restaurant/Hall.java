package restaurant;

import java.util.HashSet;
import java.util.Set;

import restaurant.staff.Waiter;

public class Hall {

    private Set<Table> tables;
    private final int NUMBER_OF_TABLES = 10;

    public Hall() {
        tables = new HashSet<>();
        for (int i = 1; i <= NUMBER_OF_TABLES; i++) {
            tables.add(new Table(i));
        }
    }

    public void showFreeTables() {
        for (Table table : tables) {
            if (table.isFree()) {
                System.out.printf("Table #%d is free\n", table.getNumber());
            }
        }
    }

    public boolean seatCustomer(Customer customer, int tableNumber) {
        if (tableNumber >= 1 && tableNumber <= tables.size()) {
            Table table = getTableByNumber(tableNumber);
            if (table.isFree()) {
                System.out.printf("Table #%d is free\n", tableNumber);
                customer.setTableNumber(tableNumber);
                table.setFree(false);
                return true;
            } else {
                System.out.printf("Table #%d is not free. Please select another table\n", tableNumber);
                return false;
            }
        }
        return false;
    }

    public boolean isTableOccupied(int tableNumber) {
        Table table = getTableByNumber(tableNumber);
        return table != null && !table.isFree();
    }

    private Table getTableByNumber(int tableNumber) {
        for (Table table : tables) {
            if (table.getNumber() == tableNumber) {
                return table;
            }
        }
        return null;
    }
}