package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int w = Integer.parseInt(parts[0]);
            int h = Integer.parseInt(parts[1]);
            int x = Integer.parseInt(parts[2]);
            int y = Integer.parseInt(parts[3]);

            StringBuilder sb = new StringBuilder();
            for (int w1 = 0; w1 < w; w1++) {

                for (int h1 = 0; h1 < h; h1++) {
                    if(w1 == x && h1 == y) {
                        sb.append("J");
                    } else {
                        sb.append("*");
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString().trim());

        }
    }
}
