public class LimitException extends Exception {

    private double remainingAmount;

    public LimitException(String message, double remaningAmount) {
        super(message);
        this.remainingAmount = remaningAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
