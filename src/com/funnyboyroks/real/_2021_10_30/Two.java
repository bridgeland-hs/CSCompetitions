package com.funnyboyroks.real._2021_10_30;

import java.util.Scanner;

public class Two {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            double qty = num * .5;

            int larges =  (int) (qty / 2);
            qty -= larges * 2;
            int mediums = (int) (qty);
            qty -= mediums;
            int smalls = (int) (qty / .5);

            String out = "";

            if (larges > 0) {
                out += larges + " large ";
            }

            if (mediums > 0) {
                out += mediums + " medium ";
            }

            if (smalls > 0) {
                out += smalls + " small ";
            }

            System.out.println(out.trim());
//            System.out.println(larges + "" + mediums + "" + smalls);


        }
    }
}
