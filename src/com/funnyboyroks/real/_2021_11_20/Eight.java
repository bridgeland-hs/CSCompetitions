package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Eight {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("training.dat"));

        int sets = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < sets; i++) {
            int appts = Integer.parseInt(scanner.nextLine());

            List<int[]> appt = new ArrayList<>();

            for (int j = 0; j < appts; j++) {
                List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                appt.add(new int[]{ ints.get(0), ints.get(1) });

            }

            for (int[] ints : appt) {
                int start = ints[0];
                int end = ints[1];
                for (int[] intsJ : appt) {
                    if (Arrays.equals(intsJ, ints)) {
                        int startJ = intsJ[0];
                        int endJ = intsJ[1];


                    }
                }
            }

        }
//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();
//
//        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)
//        List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    }

}
