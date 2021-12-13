package com.funnyboyroks.real._2021_10_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            int c = 0;
            for (int j = 1; j <= i/2; j++) {
                if(i % 2 == 0) {
                    c++;
                }
            }
            if(c == 3) {
                primes.add(i);
            }

        }
        System.out.println(primes);

        for (int i = 0; i < 4; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            List<Integer> factors = new ArrayList<>();
            for (int j = 0; j < n / 2; j++) {
                if(n % j == 0) {
                    factors.add(j);
                }
            }
            System.out.println();
        }


    }
}
