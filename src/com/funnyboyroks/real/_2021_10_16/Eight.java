package com.funnyboyroks.real._2021_10_16;

import java.util.*;
import java.util.stream.Collectors;

public class Eight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        for (String inp : input) {
            System.out.println(pascal(Integer.parseInt(inp)).stream().collect(Collectors.joining(" ")));

        }

    }

    public static List<String> pascal(int level) {
        List<Integer> current = new ArrayList<>(Collections.singletonList(1));
        List<Integer> next = new ArrayList<>();
        if(level == 1) return Collections.singletonList("1");
        for (int i = 1; i < level; i++) {
            current.add(0, 1);
            current.add(1);

            for (int j = 1; j < current.size(); j++) {
                Integer integer = current.get(j);
                next.add(integer + current.get(j - 1));
            }

            current = new ArrayList<>(next);
            next.clear();
        }
        current.add(0, 1);
        current.add(1);

        return current.stream().map(s -> s + "").collect(Collectors.toList());

    }
}
