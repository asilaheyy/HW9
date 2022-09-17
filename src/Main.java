
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
            if (index == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
            }
        }
        // 2.
        int maxCost = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        System.out.println("Максимальная трата за месяц: " + maxCost + " руб.");

        int minCost = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Минимальная трата за месяц составила: " + minCost + " руб.");
        int averageCost = sum / arr.length;
        System.out.println("Средняя трата за месяц: " + averageCost + " руб.");
    }
}



