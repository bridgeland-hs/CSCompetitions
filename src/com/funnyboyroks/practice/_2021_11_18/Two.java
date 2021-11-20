package com.funnyboyroks.practice._2021_11_18;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(n % 3 + n % 5 == 0 ? "IT'S A TRAP" : "Safe");
    }

}
