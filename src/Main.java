public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int addendOne = 300;
        int addendTwo = 1100;

        int bonus = 1;
        if (addendOne < 1000) {
            bonus = 0;
        }
        if (addendTwo > 1000) {
            bonus = addendTwo / 100;
        }

        int finalBalance = initialBalance + addendOne + addendTwo + bonus;
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
