package me.bridgeland;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line1 = input.nextLine().split(" ");
        int lines = Integer.parseInt(line1[0]);
        int base = Integer.parseInt(line1[1]);
        for (int i = 0; i < lines; i++) {
            String[] parts = input.nextLine().split(" ");
            String out = "";
            for (String part : parts) {
                out += Integer.toString(Integer.parseInt(part, base), 2) + " ";
            }
            System.out.println(out.trim());
        }
    }
}
