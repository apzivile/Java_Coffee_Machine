import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int compare = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();

        for (int value : array) {
            if (number == value) {
                compare++;
            }
        }
        System.out.println(compare);
    }
}