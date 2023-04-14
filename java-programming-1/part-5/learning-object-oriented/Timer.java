public class Timer {
    private TimerHand hundredths;
    private TimerHand seconds;

    public Timer() {
        this.hundredths = new TimerHand(100);
        this.seconds = new TimerHand(60);
    }

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.getValue() == 0)
            this.seconds.advance();

    }

    public String toString() {
        return this.seconds.toString() + ":" + this.hundredths.toString();
    }
}
