package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Three {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("armleg.dat"));

//        int n = Integer.parseInt(scanner.nextLine());
//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();
//
//        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)
//        List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            for (int n = 1; n <= ints.get(2); n++) {
                String s = "";
                if (n % ints.get(0) == 0) {
                    s += "Arm";
                }
                if (n % ints.get(1) == 0) {
                    s += "Leg";
                }
                if (s.isEmpty()) {
                    s += n;
                }
                System.out.println(s);
            }
            System.out.println();

        }


    }

}
