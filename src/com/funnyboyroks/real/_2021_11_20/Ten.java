package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ten {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("stack.dat"));

//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();

        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)

        int n = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < n; i++) {
//            List<Integer> lines = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> left = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
            List<Integer> right = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

            boolean maxL = false;
            int maxI = 0;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < left.size(); j++) {
                Integer integer = left.get(j);
                if (integer > max) {
                    max = integer;
                    maxI = j;
                    maxL = true;
                }
            }
            for (int j = 0; j < right.size(); j++) {
                Integer integer = right.get(j);
                if (integer > max) {
                    max = integer;
                    maxI = j;
                    maxL = false;
                }
            }

            List<Integer> sel = (maxL ? left : right);
            int total = 0;
            if (maxI != 0) {
                total += sel.stream().reduce(Integer::sum).orElse(0);
            } else if (sel.size() > maxI && sel.get(maxI + 1) < max) {
                
            }
            total += (maxL ? right : left).stream().reduce(Integer::sum).orElse(0);
            System.out.println(total);

        }
    }

}
