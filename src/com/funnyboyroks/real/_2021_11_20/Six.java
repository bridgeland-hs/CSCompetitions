package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Six {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("weight.dat"));

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(
                Math.round((Math.PI * Math.pow(ints.get(1), 2)
                - Math.PI * Math.pow(ints.get(2), 2))
                * ints.get(3)
                * ints.get(0)
                * 1000)
                / 1000.0
            );


        }
//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();
//
//        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)
//        List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    }

}
