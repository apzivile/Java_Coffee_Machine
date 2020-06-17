import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int count = 0;
        int first = 0;
        boolean isAsc = false;


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int value : array) {
            //  if (value>=first&&value>0){
            //    count++;
            // }

            if (value >= first) {
                // count++;
                first = value;
                isAsc = true;
            } else {
                isAsc = false;
                break;
            }
        }
        System.out.println(isAsc);

    }
}