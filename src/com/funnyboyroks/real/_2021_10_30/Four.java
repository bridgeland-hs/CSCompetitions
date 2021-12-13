package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();

            double amount;
            boolean taxable = false;
            if(line.startsWith("T")) {
                amount = Double.parseDouble(line.split(" ")[1]);
                taxable = true;
            } else {
                amount = Double.parseDouble(line);
            }
        sum += taxable ? amount * 1.0825 : amount;
        }
        System.out.println("The total is $" + Math.round(sum * 100) / 100.0);

    }
}
