import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        boolean seats = false;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = scanner.nextInt();

            }
        }

        int counter = 0;
        int row=0;
        int k = scanner.nextInt();
        //int k =3;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {

                if (matrix[i][j] == 0) {
                    counter++;
                } else if (matrix[i][j] != 0) {
                    counter = 0;
                }
                if (counter >= k) {
                    seats = true;
                    row = i+1;
                    break;
                }
            }
            if (seats){
                break;
            }
            counter = 0;
        }
        if (seats){
            System.out.println(row);
        }else {
            System.out.println(0);
        }


    }
}