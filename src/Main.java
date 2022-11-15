public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 2 - задача 1:");
        int[] spending = {156009, 171787, 117638, 144115, 169173, 188632, 109158, 139645, 107150, 111238, 108977, 174114, 119209, 173950, 163335, 180177, 167599, 161880, 156319, 158361, 166320, 160337, 118736, 133196, 127040, 191858, 103053, 163528, 198169, 153489};
        int summ = 0;
        for (int j : spending) {
            summ += j;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        System.out.println("ДЗ 2 - задача 2:");
        int max = 0;
        int min = spending[spending.length - 1];
        for (int j : spending) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("ДЗ 2 - задача 3:");
        double mean = 0;
        double summ1 = 0;
        for (int j : spending) {
            summ1 += j;
            mean = summ1 / spending.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        System.out.println("ДЗ 2 - задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}