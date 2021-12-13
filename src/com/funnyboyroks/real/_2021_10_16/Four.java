package com.funnyboyroks.real._2021_10_16;

import java.util.*;
import java.util.stream.Collectors;

public class Four {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int problems = Integer.parseInt(in.nextLine());
        for (int problemNum = 0; problemNum < problems; problemNum++) {

            int wordCount = Integer.parseInt(in.nextLine());
            List<String> words = new ArrayList<>();
            for (int wordNum = 0; wordNum < wordCount; wordNum++) {
                words.add(in.nextLine());
            }

            int lineCount = Integer.parseInt(in.nextLine());

            List<String> input = new ArrayList<>();

            for (int lineNum = 0; lineNum < lineCount; lineNum++) {
                input.add(in.nextLine());
            }

            for (int i = 0; i < input.size(); i++) {
                if(i % 2 == 1) {
                    input.set(i, reverseStr(input.get(i)));
                }
            }

            String line = input
                    .stream()
                    .map(String::trim)
                    .map(s -> s.replaceAll(" ", ""))
                    .collect(Collectors.joining(""));

            boolean solvable = true;
            for (String word : words) {
                if (!line.contains(word)) {
                    System.out.println("Unsolvable. Not fair!");
                    solvable = false;
                    break;
                }
                line.replace(word, "");
            }
            if (solvable) {
                System.out.println("All words found!");
            }


        }
    }

    public static String reverseStr(String input) {
        List<String> inputList = Arrays.stream(input.split("")).collect(Collectors.toList());
        Collections.reverse(inputList);
        return String.join("", inputList);
    }
}
