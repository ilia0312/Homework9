public class Main {
    public static void main(String[] args) {
        task1();
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
    public static void task1 () {

        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int allExpenses = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            allExpenses = allExpenses + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " +allExpenses+ " рублей");

        System.out.println("Задача 2");

        int maxExpenses = arr[0];
        int minExpenses = arr[0];
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] > maxExpenses) {
                maxExpenses = arr[i];
            }
            if (arr[i] < minExpenses) {
                minExpenses = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +minExpenses+ " рублей. Максимальная сумма трат за день составила " +maxExpenses+ " рублей");

        System.out.println("Задача 3");

        double midExpenses = 0;
            double sum = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                sum += arr[i];
            }
            midExpenses = sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + midExpenses + " рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]+ " ");

        }
    }
}