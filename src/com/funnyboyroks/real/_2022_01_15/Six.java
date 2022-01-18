package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Six {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("ishika.dat"));

        int sets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < sets; i++) {
            String line = scanner.nextLine();
            line = line.substring(line.indexOf(' ') + 1);
            List<Integer> sums = sums(Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray());
//            System.out.println(sums);
            System.out.println(sums.isEmpty() ? "NOT POSSIBLE" : sums.get(0));
        }
    }

    private static List<Integer> sums(int[] toArray) {
        List<Integer> out = new ArrayList<>();
        for (int a : toArray) {
            for (int b : toArray) {
                if (a == b) continue;
                if (a + b >= 20) {
                    out.add(a + b);
                }
            }
        }
        out.sort(Integer::compareTo);
        return out;
    }
}
