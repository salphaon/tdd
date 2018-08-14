public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
