import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int sum;
        int maxSum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        while (length <= 2) {
            if (length == 2) {
                System.out.println(array[0] * array[1]);
            } else if (length == 1) {
                System.out.println(array[0]);
            }
            break;
        }
        while (length > 2) {
            for (int i = 0; i < array.length - 1; i++) {
                sum = array[i] * array[i + 1];
                if (sum >= maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println(maxSum);
            break;
        }

    }
}