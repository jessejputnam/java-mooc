public class Main {
    public static void main(String[] args) {
        // Product tapeMeasure = new Product("Tape Measure");
        // Product plaster = new Product("Plaster", "home improvement section");
        // Product tyre = new Product("Tyre", 5);

        // System.out.println(tapeMeasure);
        // System.out.println(plaster);
        // System.out.println(tyre);

        Counter counter = new Counter(5);
        System.out.println(counter);

        counter.increase();
        System.out.println(counter);

        counter.increase(2);
        System.out.println(counter);

        counter.decrease();
        System.out.println(counter);

        counter.decrease(2);
        System.out.println(counter);
    }
}