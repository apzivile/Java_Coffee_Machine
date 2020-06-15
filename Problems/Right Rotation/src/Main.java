import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int shift = scanner.nextInt();

        shift = shift % array.length;

        for (String i : array){
            array[Integer.parseInt(i)] += shift;
        }

        System.out.println(Arrays.toString(array));
    }
}