public class CreditCalculator {
    public static void main(String[] args) {
        creditChecker("Georgi Dimitrov", 30, 5000, 12);
        creditChecker("ranodm name", 18, 800, 18);
    }

    public static void creditChecker(String fullName, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("Under 18!");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Cant get MONEY!");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println(monthlyPayment);
                }
            } else {
               double interestRate = getInterestRate(amount);
               double totalAmount = amount + (amount * interestRate * months / 12);
               double monthlyPayment = totalAmount / months;
                System.out.println(monthlyPayment);
            }

        }
    }

    public static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% do 5000 lev
        } else if (amount <= 10000) {
            return 0.04;
        } else {
            return 0.03;
        }
    }
}
