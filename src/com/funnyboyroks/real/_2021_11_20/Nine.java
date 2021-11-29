package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Nine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new File("loading.dat"));

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            List<Integer> l1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> l2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> l3 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        }

//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();
//
//        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)

    }

}
