public class RewardValue {
    public static final int MILES_PER_DOLLAR = 100;
    private double cashValue;
    private int milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue * MILES_PER_DOLLAR);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / MILES_PER_DOLLAR;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
