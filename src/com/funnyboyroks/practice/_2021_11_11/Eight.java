package com.funnyboyroks.practice._2021_11_11;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).reduce(Integer::sum).orElse(0) * 1.6;

        System.out.println(n > 622 ? "Yes" : "No");
    }
}
