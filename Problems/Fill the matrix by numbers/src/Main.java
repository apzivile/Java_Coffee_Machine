import java.awt.event.MouseAdapter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[][] matrix = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                System.out.print((matrix[i][j] = Math.abs(i - j)) + " ");
            }
            System.out.println();
        }
    }
}