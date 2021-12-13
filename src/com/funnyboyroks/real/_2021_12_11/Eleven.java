package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("aplace.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int n = scanner.nextInt();

            List<String> s = Arrays.stream(scanner.next().split("")).toList();

            for (int j = 0; j < s.size(); j++) {
                String c = s.get(j);
                if (j != 0 && j % n == 0) {
                    System.out.println();
                }
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println();


        }
    }

}
