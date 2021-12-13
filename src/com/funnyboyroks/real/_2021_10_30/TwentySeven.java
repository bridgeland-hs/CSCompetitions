package com.funnyboyroks.real._2021_10_30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TwentySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Classroom> rooms = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            rooms.add(new Classroom(scanner.nextLine(), i + 1));
        }

        System.out.println(rooms.stream().map(c -> c.size).reduce(Integer::sum).get());
        System.out.println(rooms.stream().map(c -> c.tardy).reduce(Integer::sum).get());
        rooms.sort(Comparator.comparingDouble(Classroom::attendance));
        System.out.println(rooms.get(0).n);
        System.out.println(rooms.stream().map(c -> c.n).collect(Collectors.joining(" ")));


    }

    public static class Classroom {
        public final int size;
        public final int absent;
        public final int tardy;
        public final String n;

        public Classroom(String data, int n) {
            String[] parts = data.split(" ");
            this.size = Integer.parseInt(parts[0]);
            this.absent = Integer.parseInt(parts[1]);
            this.tardy = Integer.parseInt(parts[2]);
            this.n = n + "";
        }

        public double attendance() {
            return absent / (double) size;
        }
    }
}
