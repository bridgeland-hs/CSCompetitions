package me.bridgeland;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Three {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lines = Integer.parseInt(in.nextLine());

        List<List<Integer>> intLines = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String line = in.nextLine();

            String[] parts = line.split(" ");

            List<Integer> intParts = Arrays.stream(parts).map(Integer::parseInt).collect(Collectors.toList()).subList(1, parts.length);

            intLines.add(intParts);

        }

        intLines.forEach(l -> {
            BigInteger current = BigInteger.valueOf(l.get(0));
            for (int j = 1; j < l.size(); j++) {
                Integer i = l.get(j);
                current = current.pow(i);
            }
            System.out.println(current.mod(BigInteger.valueOf(1_000_000_007)));
        });
    }
}
