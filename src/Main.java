
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // 1.
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // 2.
        int max_Value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_Value) {
                max_Value = arr[i];
            }
        }
        System.out.println("Максимальная трата за месяц: " + max_Value + " руб.");

        int min_Value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_Value) {
                min_Value = arr[i];
            }
        }
        System.out.println("Минимальная трата за месяц составила: " + min_Value + " руб.");

        // 3.
        double averageCost = sum / arr.length;
        System.out.println("Средняя трата за месяц: " + averageCost + " руб.");

        // 4.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}



