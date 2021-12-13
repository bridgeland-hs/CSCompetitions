package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ten {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("curling.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int ns = scanner.nextInt();
            double dest = scanner.nextDouble();
            List<Double[]> dists = new ArrayList<>();
            for (int j = 0; j < ns; j++) {
                double d = scanner.nextDouble();
                dists.add(new Double[]{d,  Math.abs(d - dest) });
            }
            dists.sort(Comparator.comparingDouble(d -> d[1]));
            System.out.println(dists.stream().map(d -> d[0]).map(Object::toString).collect(Collectors.joining("\n")));
            System.out.println("-".repeat(10));
        }
    }

}
