package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zero {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.dat"));
        int s = scanner.nextInt();

        System.out.println(s);

        System.out.println();

        System.out.println("Team Number: 90");
        System.out.println("Team Members: Hayden Pott, Robert Carmel, and Joshua Holmes");
        System.out.println("School Name: Bridgeland High School");
        System.out.println("Division: Advanced");

    }

}
