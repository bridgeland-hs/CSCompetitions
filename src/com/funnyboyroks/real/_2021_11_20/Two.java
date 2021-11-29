package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Two {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("balance.dat"));

        int sets = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < sets; i++) {
            List<Integer> weights = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int massL = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).reduce(Integer::sum).orElse(0);
            int massR = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).reduce(Integer::sum).orElse(0);
            System.out.println(massL == massR && Objects.equals(weights.get(0), weights.get(1)) ? "safe to lift" : "unsafe");


        }

    }

}
