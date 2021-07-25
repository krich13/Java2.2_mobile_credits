public class Main {
    public static void main(String[] args) {
        int account_amount = 500;
        int new_payment = 1200;

        int bonus;
        if (new_payment < 1000) {
            bonus = 0;
        }
        else {
            bonus = new_payment / 100;
        }

        int final_amount;
        if (new_payment > 1000) {
            final_amount = bonus + new_payment + account_amount;
        }
        else {
            final_amount = new_payment + account_amount;
        }
        System.out.println(final_amount);
        System.out.println(bonus);}
}