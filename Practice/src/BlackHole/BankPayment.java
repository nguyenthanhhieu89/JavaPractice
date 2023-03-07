package BlackHole;

public class BankPayment {

    static double TOTAL_LOAN = 900000;

    static double INTEREST_RATE_PER_MONTH = 0.1 / 12;

    static int TOTAL_MONTH = 120;

    public static void main(String[] args) {
        calculating(1);
        TOTAL_LOAN -= 100000;
        INTEREST_RATE_PER_MONTH = 0.115 / 12;
        calculating(2);
    }

    static void calculating(int year) {
        double principleAmount = TOTAL_LOAN / TOTAL_MONTH;
        System.out.println("\n\nYear : " + year);
        for (int i = 1; i <= 12; i++) {
            double profitAmount = TOTAL_LOAN * INTEREST_RATE_PER_MONTH;
            double monthlyPay = principleAmount + profitAmount;
            TOTAL_LOAN -= principleAmount;
            System.out.println("==========================================================================================");
            System.out.println("Month: " + i + "\t\t||\t\tMust pay: " + formatMoney(monthlyPay) + " VNĐ" + "\t\t||\t\tLoan Still: " + formatMoney(TOTAL_LOAN) + " VNĐ");
            TOTAL_MONTH--;
        }
    }

    static String formatMoney(double money) {
        money = Math.ceil(money);
        StringBuilder resource = new StringBuilder(String.valueOf((int) money * 1000));
        StringBuilder result = new StringBuilder();
        resource.reverse();
        for (int i = 0; i < resource.length(); i++) {
            result.append(resource.charAt(i));
            if ((i + 1) % 3 == 0) {
                result.append(",");
            }
        }
        result.reverse();
        if (result.charAt(0) == ',') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
