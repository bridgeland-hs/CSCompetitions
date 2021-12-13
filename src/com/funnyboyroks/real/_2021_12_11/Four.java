package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("amogus.dat"));

        int p = scanner.nextInt();

        Map<String, Integer> players = new HashMap<>();

        for (int i = 0; i < p; ++i) {
            players.put(scanner.next(), scanner.nextInt());
        }

        int r = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < r; i++) {
            String[] names = scanner.nextLine().split(" ");
            int combined = Arrays.stream(names).map(players::get).reduce(0, Integer::sum);
            System.out.println(combined > p - names.length ? "Imposters Win!" : "LOL THESE IMPOSTERS SUCK!");
        }

    }

}
