package com.funnyboyroks.real._2021_10_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = Integer.parseInt(in.nextLine());

        List<Double> values = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String[] strParts = in.nextLine().split(" ");
            values.add(
                    Double.parseDouble(strParts[0]) *
                            Double.parseDouble(strParts[1])
            );

        }
        System.out.println(Math.round(values.stream().reduce(Double::sum).orElse(0.0) * 100) / 100.0);
    }
}
