package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ten {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("renata.dat"));

        int sets = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= sets; i++) {
            int size = scanner.nextInt();
            scanner.nextLine();

            int[][] mat = new int[size][size];
            for (int j = 0; j < size; j++) {
                mat[j] = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

//            System.out.println(Arrays.stream(mat).map(Arrays::toString).collect(Collectors.joining("\n")));

            int positions = scanner.nextInt();
            scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < positions; j++) {
                try {
                    int y = scanner.nextInt() - 1;
                    int x = scanner.nextInt() - 1;
                    if(y  == -1 || x == -1) continue;
                    scanner.nextLine();

                    sum += mat[y][x];
                } catch (IndexOutOfBoundsException ignored) {
                }
            }
            System.out.println(i + ": " + sum);


        }

    }

}
