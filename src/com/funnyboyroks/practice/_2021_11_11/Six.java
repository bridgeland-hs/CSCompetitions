package com.funnyboyroks.practice._2021_11_11;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            sb.append(i).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
