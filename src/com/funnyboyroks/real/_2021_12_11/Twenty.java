package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Twenty {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("bye.dat"));
        scanner.nextInt();

        while(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i >= 62 ? "Goodbye World" : "Flying smoothly!");
        }

    }
}
