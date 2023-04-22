public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity, initialBalance);

        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public ProductWarehouseWithHistory(String name, double capacity) {
        super(name, capacity);

        this.history = new ChangeHistory();
    }

    @Override
    public boolean addToWarehouse(double amount) {
        boolean success = super.addToWarehouse(amount);
        if (!success)
            return false;

        this.history.add(this.getBalance());
        return true;
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        if (taken != 0)
            this.history.add(this.getBalance());

        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }

    public String history() {
        return this.history.toString();
    }
}
