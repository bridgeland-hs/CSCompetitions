package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

public class Fifteen {

    private static final Map<String, String> NAMES = new HashMap<>();

    static {
        NAMES.put("P", "Prancer");
        NAMES.put("D", "Dasher");
        NAMES.put("C", "Comet");
        NAMES.put("V", "Vixen");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("tabletennis.dat"));

        while(scanner.hasNext()) {
            int scoreNeeded = scanner.nextInt();
            List<String> stuff = Arrays.stream(scanner.next().split("")).toList();

            Map<String, LongAdder> map = new TreeMap<>();

            for (String s : stuff) {
                map.putIfAbsent(s, new LongAdder());
                map.get(s).increment();
                if(map.get(s).intValue() >= scoreNeeded) {
                    System.out.println(NAMES.get(s));
                    break;
                }
            }

        }


    }

}
