package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");

        String out = "";
        for (String num : nums) {
            int n = Integer.parseInt(num);

            if (n <= 25) {
                n *= 2;
            } else if (n <= 50) {
                n = (int) Math.round(n * 1.5);
            } else if (n <= 75) {
                n = (int) Math.round(n * 1.25);
            } else if (n <= 100) {
            } else {
                n = (int) Math.round(n * .9);
            }
            out += n + " ";
        }
        System.out.println(out.trim());
    }
}
