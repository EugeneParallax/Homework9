public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {            // Calculate and print array sum
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int expense : arr) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {            // Find and print min/max values
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 1;

        for (int value : arr) {
            if (value < min) min = value;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        for (int value : arr) {
            if (value > max) max = value;
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {            // Calculate and print average of an array
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }
        float average = (float) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {            // Character array inversion
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }
    }
}