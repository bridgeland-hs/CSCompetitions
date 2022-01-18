package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Seven {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("krish.dat"));

        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++) {
            int num = scanner.nextInt();
            boolean negative = num != (num = Math.abs(num));
            String numS = num + "";
            long reverse = (negative ? -1 : 1) * Integer.parseInt(reverse(numS));

            long digitSum = Arrays.stream(numS.split(""))
                .mapToLong(Long::parseLong)
                .map(n -> (negative ? -1 : 1) * n)
                .sum();

            long digitProduct = Arrays.stream(numS.split(""))
                .mapToLong(Long::parseLong)
                .map(n -> (negative ? -1 : 1) * n)
                .filter(n -> n != 0)
                .reduce(1, (a, b) -> a * b);
            System.out.println(
                (negative ? -1 : 1) * num + " " +
                digitSum + " " +
                digitProduct + " " +
                reverse + " " +
                (negative ? -1 : 1) * num * reverse

            );
        }

    }

    private static String reverse(String str) {
        List<String> strl = Arrays.stream(str.split("")).collect(Collectors.toList());
        Collections.reverse(strl);
        return String.join("", strl);

    }

}
