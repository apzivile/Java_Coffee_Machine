package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterNeeded = 200;
        int milkNeeded = 50;
        int beansNeeded = 15;
        int cupsPossible = 0;
        int moreCups;

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();

        while (waterNeeded <= water && milkNeeded <= milk && beansNeeded <= beans) {
            water -= waterNeeded;
            milk -= milkNeeded;
            beans -= beansNeeded;
            cupsPossible++;
        }

        if (cupsPossible == numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsPossible > numberOfCups) {
            moreCups = cupsPossible - numberOfCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + moreCups + " more than that)");
        } else {
            System.out.println("No, I can make only " + cupsPossible + " cup(s) of coffee");
        }

    }
}
