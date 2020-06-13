import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int compare = 0;
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) { //add input to array
            array[i] = scanner.nextInt();
        }
        int integer = scanner.nextInt(); // scan input to compare
        for (int i : array) {//go through array and check if array element is equal to input
            if (i == integer) {//if yes increase compare variable
                compare++;
            }
        }
        // if compare is more than 0 it means that program found at least one identical element
        System.out.println(compare > 0);
    }
}