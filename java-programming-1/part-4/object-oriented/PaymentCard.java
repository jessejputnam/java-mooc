public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public String toString() {
        return "This card has a balance of $" + this.balance;
    }

    public void eatAffordably() {
        double result = this.balance - 2.6;
        if (result >= 0)
            this.balance = result;
    }

    public void eatHeartily() {
        double result = this.balance - 4.6;
        if (result >= 0)
            this.balance = result;
    }

    public void addMoney(double amount) {
        if (amount < 0)
            return;
        this.balance += amount;
        if (this.balance > 150)
            this.balance = 150;
    }
}
