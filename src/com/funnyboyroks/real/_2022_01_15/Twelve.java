package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAdder;

public class Twelve {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("tom.dat"));

        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            String word = scanner.next();
            Map<Character, LongAdder> map = new HashMap<>();
            int score = 0;
            for (char c : word.toCharArray()) {
                map.putIfAbsent(c, new LongAdder());
                map.get(c).increment();
                score += map.get(c).intValue();
            }
            System.out.println(score);
        }

    }

}
