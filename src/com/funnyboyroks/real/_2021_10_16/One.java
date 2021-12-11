package me.bridgeland;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.print(input);

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.substring(0, i));
        }
    }
}
