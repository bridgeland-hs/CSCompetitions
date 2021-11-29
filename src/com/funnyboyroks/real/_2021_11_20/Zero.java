package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zero {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.in"));

        int numberPiles = scanner.nextInt();
        int presents = 0;
        for (int i = 0; i < numberPiles; i++) {
            presents += scanner.nextInt();
        }
        System.out.println(presents);

    }
}
