import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) { //add input to array
            array[i] = scanner.nextInt();
        }

        int nNumber = scanner.nextInt();
        int mNumber = scanner.nextInt();
        boolean compare = false;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (nNumber == array[i] && mNumber == array[i + 1]) {
                    compare = true;
                    break;
                }
            } else if ((nNumber == array[i] && mNumber == array[i - 1]) || (nNumber == array[i - 1] && mNumber == array[i])) {
                compare = true;
                break;
            }
        }
        System.out.println(compare);
    }

}
