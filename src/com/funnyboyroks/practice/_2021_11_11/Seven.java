package com.funnyboyroks.practice._2021_11_11;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freq = Integer.parseInt(scanner.nextLine());

        int count = 0;

        String next = scanner.nextLine();
        while(!next.equals("0")) {
            if(freq > Integer.parseInt(next)) {
                ++count;
            }
            next = scanner.nextLine();
        }
        System.out.println(count);
    }
}
