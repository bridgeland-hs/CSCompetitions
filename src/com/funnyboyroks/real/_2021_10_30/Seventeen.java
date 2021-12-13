package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            double x = Double.parseDouble(parts[3]);

            double F = (a * x * x) + (b * x) + (c);
            double roundedF = Math.round(F * 1000) / 1000.0;

            String[] p = (roundedF + "").split("\\.");

            String d = p[1];

            while(d.length() < 3) {
                d += "0";
            }

            System.out.println(p[0]+ "." + d);

        }
    }
}
