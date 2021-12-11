package me.bridgeland;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split(" ");

            boolean men = parts[0].equalsIgnoreCase("men");
            boolean uk = parts[1].equalsIgnoreCase("uk");
            int size = Integer.parseInt(parts[2]);

            System.out.println(
                    (men ? "Men " : "Women ") +
                            (uk ? "US " : "UK ") +
                            (uk ? (size + (men ? 1 : 2)) : (size - (men ? 1 : 2)))

            );
        }
    }
}
