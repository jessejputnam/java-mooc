import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.size() == 0)
            return 0;

        double maxValue = this.history.get(0);
        for (double value : this.history) {
            if (value > maxValue)
                maxValue = value;
        }

        return maxValue;
    }

    public double minValue() {
        if (this.history.size() == 0)
            return 0;

        double minValue = this.history.get(0);
        for (double value : this.history) {
            if (value < minValue)
                minValue = value;
        }

        return minValue;
    }

    public double average() {
        if (this.history.size() == 0)
            return 0;

        double total = 0;
        for (double value : this.history) {
            total += value;
        }

        return Math.round((total / this.history.size()) * 10) / 10.0;
    }

    public String toString() {
        return this.history.toString();
    }
}