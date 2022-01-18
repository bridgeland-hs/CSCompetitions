package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("carolina.dat"));

        double sum = 0;
        double totalTax = 0;
        double totalCost = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            double num = Double.parseDouble(parts[0]);
            totalCost += num;
            String rest = line.substring(line.indexOf(" ") + 1);
            double tax = num * .0825;
            totalTax += tax;
            tax = Math.round(tax * 100) / 100.0;
            sum += tax + num;
            System.out.printf("$%.2f + $%.2f = $%.2f %s%n", num, tax, num + tax, rest);
        }
        System.out.printf("$%.2f + $%.2f = $%.2f Combined Single Purchase%n", totalCost, totalTax, totalCost + totalTax);
        System.out.printf("$%.2f Sum of Individual Purchases%n", sum);
    }

}
