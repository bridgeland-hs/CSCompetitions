package com.funnyboyroks.real._2021_10_16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Thirteen {
    public static void main(String[] args) {
        String input = (new Scanner(System.in)).nextLine();

        String[] words = input.split(" ");

        StringBuilder out = new StringBuilder();
        for (String word : words) {
            out.append(reverseStr(word)).append(" ");
        }
        System.out.println(out.toString().trim());
    }

    public static String reverseStr(String input) {
        List<String> inputList = Arrays.stream(input.split("")).collect(Collectors.toList());
        Collections.reverse(inputList);
        return String.join("", inputList);
    }
}
