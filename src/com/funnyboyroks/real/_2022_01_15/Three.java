package com.funnyboyroks.real._2022_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Three {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dhruv.dat"));
        List<String> lines = new ArrayList<>();
        while(scanner.hasNextLine()) lines.add(scanner.nextLine());

        List<String> channels = lines.stream().filter(l -> l.contains(" ")).toList();
        Map<Integer, String> stations = new HashMap<>();

        lines.removeIf(l -> l.contains(" "));

        for (String channel : channels) {
            var parts = channel.split(" ");
            stations.put(Integer.parseInt(parts[1]), parts[0]);
        }

        lines = lines.subList(1, lines.size());

        for (String line : lines) {
            int l = Integer.parseInt(line);
            if(535 <= l && l <= 1605) {

            int close = getClosest(l, stations.keySet());
            System.out.println(stations.getOrDefault(close, "wtf"));
            } else {
                System.out.println("BAD INPUT");
            }

        }

    }

    public static int getClosest(int n, Collection<Integer> ints) {
        var copy = new ArrayList<>(ints);
        copy.sort(Comparator.comparingInt(m -> Math.abs(n - m)));
        if(Math.abs(n - copy.get(0)) == Math.abs(n - copy.get(1))) {
            return Math.max(copy.get(0), copy.get(1));
        }
        return copy.get(0);
    }

}
