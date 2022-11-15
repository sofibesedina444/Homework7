public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1 - задачи: 1, 2 и 3, 4");
        // Решение 1 задачи
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] myArr = {1.57, 7.654, 9.986};
        int[] helloWorld = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Решение 2 и 3 задачи для первого массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Решение для 4 задачи
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // Решение 2 и 3 задачи для второго массива
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
            if (i != myArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = myArr.length - 1; i >= 0; i--) {
            System.out.print(myArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Решение 2 и 3 задачи для третьего массива
        for (int i = 0; i < helloWorld.length; i++) {
            System.out.print(helloWorld[i]);
            if (i != helloWorld.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = helloWorld.length - 1; i >= 0; i--) {
            System.out.print(helloWorld[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}