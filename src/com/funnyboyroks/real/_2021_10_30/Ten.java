package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split(" ");
            double out = Integer.parseInt(parts[0]) *
                    Integer.parseInt(parts[1]) *
                    1.1;
            if (out - (int) out > .01) {
                out = Math.ceil(out);
            }
            System.out.println(
                    (int) out
            );
        }

    }
}
