package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        action(water, milk, beans, cups, money);
    }

    public static void printLines(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void action(int water, int milk, int beans, int cups, int money) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String action = scanner.nextLine();

        while (!action.equals("exit")) {

            switch (action) {
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    // int number = scanner.nextInt();
                    String string = scanner.nextLine();
                    int number = Integer.parseInt(string);
                    water += number;
                    System.out.println("Write how many ml of milk do you want to add:");
                    string = scanner.nextLine();
                    number = Integer.parseInt(string);
                    milk += number;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    string = scanner.nextLine();
                    number = Integer.parseInt(string);
                    beans += number;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    string = scanner.nextLine();
                    number = Integer.parseInt(string);
                    cups += number;

                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    action = scanner.nextLine();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffee = scanner.nextLine();
                    switch (coffee) {
                        case "1":
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                water -= 250;
                                beans -= 16;
                                cups--;
                                money += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups--;
                                money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups--;
                                money += 6;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    action = scanner.nextLine();
                    break;

                //continue;
                case "take":
                    System.out.println("I give you : " + money);
                    money = 0;
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    action = scanner.nextLine();
                    break;
                case "remaining":
                    printLines(water, milk, beans, cups, money);
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    action = scanner.nextLine();
                    break;
            }
        }
    }
}
