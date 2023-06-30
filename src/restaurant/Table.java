package restaurant;

public class Table {

    private int number;
    private boolean isFree;

    public Table(int number) {
        this.number = number;
        this.isFree = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
