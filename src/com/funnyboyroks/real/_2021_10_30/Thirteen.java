package com.funnyboyroks.real._2021_10_30;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Thirteen {

    private static final List<String> NOUNS = new ArrayList<>();
    private static final List<String> VERBS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ;

        NOUNS.addAll(List.of(scanner.nextLine().toLowerCase().split(" ")));
        VERBS.addAll(List.of(scanner.nextLine().toLowerCase().split(" ")));
        VERBS.addAll(List.of(scanner.nextLine().toLowerCase().split(" ")));

        int dataSets = Integer.parseInt(scanner.nextLine().toLowerCase());
        for (int i = 0; i < dataSets; i++) {
            String[] parts = scanner.nextLine().toLowerCase().split(" ");
            int lines = Integer.parseInt(parts[1]);
            String word = parts[0];

            for (int j = 0; j < lines; j++) {
                List<String> line = List.of(scanner.nextLine().toLowerCase().split(" "));

                String prev = "";
                for (String s : line) {
                    s = s.replaceAll("[!.?,]", "");
                    if (s.equalsIgnoreCase(word)) {
                        if (NOUNS.contains(prev)) {
                            System.out.println("NOUN");
                        } else if (VERBS.contains(prev)) {
                            System.out.println("VERB");

                        }
                    }
                    prev = s;
                }
            }
            System.out.println();
        }
    }
}
