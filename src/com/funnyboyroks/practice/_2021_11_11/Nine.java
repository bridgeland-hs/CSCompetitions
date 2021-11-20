package com.funnyboyroks.practice._2021_11_11;

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();

        while(!next.equalsIgnoreCase("-1")) {
            String[] part = next.split(" ");
            double n = Double.parseDouble(part[0]);
            if (part[1].equalsIgnoreCase("y")) {
                n *= 1.8;
            } else {
                n *= 2;
            }
            System.out.println(Math.round(n * 100) / 100.0);
            next = scanner.nextLine();
        }
    }
}
