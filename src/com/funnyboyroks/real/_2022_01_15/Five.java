package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Five {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("harold.dat"));

        int lines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            char c = line.charAt(0);
            String t = line.substring(1).replaceAll("0+$", "");
            System.out.printf("%s=%s*10^%s%n", line, c + "." + t, t.length());

        }
    }

}
