package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("eva.dat"));

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int ct = 1;
            System.out.printf("Start of Triangle #%d%n", i + 1);
            for (int j = 0; j < num; j++) {
                int pad = num - j - 1;
                System.out.println(
                    " ".repeat(pad) +
                    "*".repeat(ct) +
                    " ".repeat(pad)
                );
                ct += 2;
            }
            System.out.printf("End of Triangle #%d%n", i + 1);
        }
    }

}
