import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        long shift = scanner.nextLong();
        shift = shift % array.length;
        for (int i = 0; i < shift; i++) {
            int j;
            String last;
            //Stores the last element of array
            last = array[array.length - 1];

            for (j = array.length - 1; j > 0; j--) {
                //Shift element of array by one
                array[j] = array[j - 1];
            }
            //Last element of array will be added to the start of array.
            array[0] = last;
        }
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
