/**
 * public double maxValue() returns the largest value in the change history. If
 * the history is empty, the method should return zero.
 * 
 * public double minValue() returns the smallest value in the change history. If
 * the history is empty, the method should return zero.
 * 
 * public double average() returns the average of the values in the change
 * history. If the history is empty, the method should return zero.
 */

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity, double initialBalance) {
        this.capacity = capacity >= 0 ? capacity : 0;
        this.balance = initialBalance;
    }

    public Warehouse(double capacity) {
        this.capacity = capacity >= 0 ? capacity : 0;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return Math.round((this.capacity - this.balance) * 10) / 10.0;
    }

    public boolean addToWarehouse(double amount) {
        if (amount < 0)
            return false;

        this.balance += amount;
        if (this.balance > this.capacity)
            this.balance = this.capacity;

        return true;
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0)
            return 0;

        if (this.balance - amount < 0) {
            double taken = this.balance;
            this.balance = 0;
            return taken;
        }

        this.balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + this.howMuchSpaceLeft();
    }
}
