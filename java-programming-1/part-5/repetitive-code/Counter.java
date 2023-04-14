public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public void increase(int num) {
        this.value += num;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int num) {
        this.value -= num;
    }

    public String toString() {
        return "Value is " + this.value;
    }
}
