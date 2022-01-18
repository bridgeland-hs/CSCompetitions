package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.dat"));
        int nextInt = scanner.nextInt();
        for (int i = 0; i++ < nextInt;) System.out.printf("I like %s.%n", scanner.next());
    }

}
