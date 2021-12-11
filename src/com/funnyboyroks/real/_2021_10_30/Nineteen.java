package me.bridgeland;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        double mult = 1.066 / 5.0;

        for (int i = 0; i < lines; i++) {
            System.out.println(Math.round(Integer.parseInt(scanner.nextLine()) * mult * 10) / 10.0);
        }
    }
}
