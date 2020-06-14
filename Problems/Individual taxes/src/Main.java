import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfCompanies = scanner.nextInt();

        int[] yearlyIncome = new int[numberOfCompanies];
        int[] taxesPercentage = new int[numberOfCompanies];

        int maxTaxes = 0;
        int position = 0;

        for (int i = 0; i < yearlyIncome.length; i++) {
            yearlyIncome[i] = scanner.nextInt();
        }
        for (int i = 0; i < yearlyIncome.length; i++) {
            taxesPercentage[i] = scanner.nextInt();

            int taxes = yearlyIncome[i] * taxesPercentage[i];

            if (taxes >= maxTaxes) {
                maxTaxes = taxes;
                position = i + 1;
            }
        }
        System.out.println(position);

    }
}