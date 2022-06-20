public class Main {
    public static void main(String[] args) {

        int userBalance = 100;
        int income = 1200;

        System.out.println("Баланс: " + userBalance);
        System.out.println("Счет пополнен на: " + income);

        int balans2 = userBalance + income;
        System.out.println("Баланс: " + balans2);

        int bonus;
        if (income >= 1000) {
            bonus = (int) income / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Получено бонусов: " + bonus);

        int balans3 = balans2 + bonus;
        System.out.println("Баланс: " + balans3);
    }
}