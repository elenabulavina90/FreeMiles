public class main {
    public static void main(String[] args) {
        int amount = 100;
        int RUB = 20;
        int flyMiles = 1;

        int bonusRUB = amount / RUB;

        if (bonusRUB > 20) {
            bonusRUB = 20;
        } else {
            flyMiles = 1 * bonusRUB;
        }
        System.out.println("Мили:" + flyMiles);
    }
}