package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Twelve {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("shift.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            List<String> line = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
            Collections.reverse(line);
            List<String> move = line.subList(0, n);
            line = line.subList(n, line.size());
            line.addAll(move);

            System.out.println(String.join("", line));

        }

    }

}
