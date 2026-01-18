
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTY_PRICE = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment < AFFORDABLE_PRICE) {
            return payment;
        }
        this.money += AFFORDABLE_PRICE;
        this.affordableMeals++;
        return payment - AFFORDABLE_PRICE;
    }

    public double eatHeartily(double payment) {
        if (payment < HEARTY_PRICE) {
            return payment;
        }
        this.heartyMeals++;
        this.money += HEARTY_PRICE;
        return payment - HEARTY_PRICE;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(AFFORDABLE_PRICE)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(HEARTY_PRICE)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
