package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Three {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("yourmom.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            List<String> lines = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                String l = scanner.nextLine();
                if (!l.isEmpty()) {
                    lines.add(l);
                }
            }
//            System.out.println(lines);

            lines.sort(Comparator.comparingInt(Three::a));
            Collections.reverse(lines);
            System.out.println("The best Your Mom Joke is: " + lines.get(0));
        }
    }

    public static int a(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        return sum;
    }

}
