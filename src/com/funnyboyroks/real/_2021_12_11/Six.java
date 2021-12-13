package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Six {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("drift.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            double b = Math.round(
                Math.sqrt(-(a * a) + c * c)
                * 10000
            ) / 10000.0;
            String[] parts = (b + "").split("\\.");
            parts[1] += "0000000000";
            parts[1] = parts[1].substring(0, 4);
            System.out.println(String.join(".", parts));
        }


    }

}
