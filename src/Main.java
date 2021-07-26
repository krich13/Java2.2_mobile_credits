public class Main {
    public static void main(String[] args) {
        int accountAmount = 500;
        int newPayment = 1200;

        int bonus;
        if (newPayment < 1000) {
            bonus = 0;
        } else {
            bonus = newPayment / 100;
        }

        int finalAmount;
        if (newPayment > 1000) {
            finalAmount = bonus + newPayment + accountAmount;
        } else {
            finalAmount = newPayment + accountAmount;
        }
        System.out.println(finalAmount);
        System.out.println(bonus);
    }
}