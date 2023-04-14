public class TimerHand {
    private int value;
    private int limit;

    public TimerHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public void advance() {
        this.value++;
        if (this.value == limit)
            this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        if (this.getValue() < 10)
            return "0" + this.getValue();

        return "" + this.getValue();
    }
}
