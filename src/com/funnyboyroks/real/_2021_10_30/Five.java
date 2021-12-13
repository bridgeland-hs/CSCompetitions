package com.funnyboyroks.real._2021_10_30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        Iterator<String> input = List.of(scanner.nextLine().split("\n")).iterator();
        for (int i = 0; i < 10; i++) {
            words.addAll(List.of(input.next().split(" ")));
        }

        String line = input.next();
        while (!input.hasNext()) {

            String test = line.replaceAll("\\*", ".");

            String w = (words.stream().filter(s -> s.matches(test)).collect(Collectors.joining(" ")));
            System.out.println(w.isEmpty() ? "NO MATCH" : w);
            line = input.next();
        }

        int lines = Integer.parseInt(input.next());


    }
}
