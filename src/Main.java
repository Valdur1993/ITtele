public class Main {
    public static void main(String[] args) {
        int subscriberAccount = 100;
        int bonusRange = 100;
        int balanceReplenishment = 1100;

        int bonus;
        if (balanceReplenishment >= 1000) {
            bonus = balanceReplenishment / bonusRange;
        } else {
            bonus = 0;
        }

        int finalScore = subscriberAccount + balanceReplenishment + bonus;

        System.out.println("Ваш счет пополнился на: " + balanceReplenishment + " руб.");
        System.out.println("Бонус для вас составил: " + bonus + " руб.");
        System.out.println("Ваш итоговый баланс:  " + finalScore + " руб.");
    }
}