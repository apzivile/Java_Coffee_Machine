import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();

        for (int value : arr) {
            if (value > number) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}