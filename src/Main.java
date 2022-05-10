public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // Задание 1
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");
        // Задание 2
        int maxDay = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxDay) {
                maxDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма за день" + maxDay + " рублей");
        int minDay = 200_000;
        for (int j : arr) {
            if (j < minDay) {
                minDay = j;
            }

        }
        System.out.println("Минимальная сумма за день " + minDay + " рублей");

        //Задание 3
        double summ = 0;
        for (double j : arr) {
            summ += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (summ / 30) + " рублей");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName [i]);

        }

        }




















        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;

        }



    }










