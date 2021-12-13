package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sixteen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("bitdumb.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int s = scanner.nextInt();
            int n1 = 1;
            int n2 = 1;
            for (int j = 2; j <= s; j++) {
                n1 ^= j;
                n2 |= j;
            }
            System.out.println(n1 + " " + n2);

        }

    }

}
