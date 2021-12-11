package me.bridgeland;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            double amt = Double.parseDouble(scanner.nextLine());
            System.out.println("$" + Math.round(amt * 1.0825 * 100) / 100.0);
        }
    }
}
