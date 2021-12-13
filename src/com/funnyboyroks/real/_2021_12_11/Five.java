package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.LongAdder;

public class Five {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("counting.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int vals = scanner.nextInt();
            Map<Integer, LongAdder> map = new TreeMap<>();

            for (int i1 = 0; i1 < vals; i1++) {
                int n = scanner.nextInt();
                map.putIfAbsent(n, new LongAdder());
                map.get(n).increment();
            }

            List<Map.Entry<Integer, LongAdder>> l = map.entrySet().stream().sorted((a, b) -> {
                if (a.getValue().intValue() - b.getValue().intValue() != 0) {
                    return b.getValue().intValue() - a.getValue().intValue();
                }
                return a.getKey() - b.getKey();
            }).toList();
            l = l.subList(0, Math.min(l.size(), 5));
            for (Map.Entry<Integer, LongAdder> entry : l) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println();


        }

    }

}
