package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int o = Integer.parseInt(parts[0]);
            int n = Integer.parseInt(parts[1]);
            System.out.println((n + o) % 4);
        }
    }
}
