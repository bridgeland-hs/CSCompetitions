package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class One {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("sets.dat"));

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int sets = Integer.parseInt(parts[0]);
            int reps = Integer.parseInt(parts[1]);
            for (int x = 1; x <= sets; x++) {
                for (int y = 1; y <= reps; y++) {
                    System.out.println("set " + x + " rep " + y);
                }
            }
                System.out.println();
        }
    }

}
