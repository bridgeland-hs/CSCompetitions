package me.bridgeland;

import java.util.*;
import java.util.stream.Collectors;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            elements.addAll(
                    Arrays.stream(scanner.nextLine().split(" "))
                            .map(String::toLowerCase)
                            .collect(Collectors.toList())
            );
        }

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine().toLowerCase();
            boolean valid = true;
            while (line.length() > 0) {
                if (elements.contains(line.substring(0, 1))) {
                    line = line.substring(1);
                } else if (line.length() > 1 && elements.contains(line.substring(0, 2))) {
                    line = line.substring(2);
                } else {
                    valid = false;
                    break;
                }
            }
            System.out.println(valid ? "yes" : "no");
        }
    }
}
