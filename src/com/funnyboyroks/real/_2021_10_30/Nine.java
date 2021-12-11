package me.bridgeland;

import java.util.List;
import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] chars = scanner.nextLine().split("");
            int vowels = 0;
            int con = 0;
            for (String c : chars) {
                if (List.of("a", "e", "i", "o", "u").contains(c)) {
                    ++vowels;
                } else {
                    con++;
                }
            }
            System.out.println(vowels >= con ? "YES" : "NO");
        }
    }
}
