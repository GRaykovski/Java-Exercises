package main;

import java.util.Scanner;

public class Currencies {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double[] currencies = new double[] { 0.56, 1.24, 1.1 };

        System.out.println("Choose a currency:");
        System.out.println("Press 1 for : LEV");
        System.out.println("Press 2 for : GBT");
        System.out.println("Press 3 for : EUR");
        int currencyType = a.nextInt();

        System.out.println("Enter value:");
        double value = a.nextInt();

        if (currencyType == 1) {
            System.out.println("LEV to USD: " + currencies[currencyType - 1] * value);
        }
        if (currencyType == 2) {
            System.out.println("GBT to USD: " + currencies[currencyType - 1] * value);
        }
        if (currencyType == 3) {
            System.out.println("EUR to USD: " + currencies[currencyType - 1] * value);
        }
    }

}

