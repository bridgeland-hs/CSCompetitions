package com.funnyboyroks.real._2021_11_20;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Seven {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("funk.dat"));

//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();
//
//        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)
//        List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sets = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sets; i++) {
            List<Integer> ints = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            int area = ints.get(0) * ints.get(0);
            int lines = ints.get(1);

            List<Area> areas = new ArrayList<>();
            for (int j = 0; j < lines; j++) {
                List<Integer> parts = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                areas.add(new Area(parts.get(0), parts.get(1), parts.get(2)));
            }

            List<Area> areas2 = new ArrayList<>();
            for (Area a1 : areas) {
                for (Area a2 : areas) {
                    if(!(a1.overlapping(a2) && a1.r > a2.r)) {
                        areas2.add(a1);
                    }
                }
            }
            areas = areas2;

            double sum =areas.stream().map(Area::area).reduce(Double::sum).orElse(0.0);

            System.out.println("area = " + area);
            System.out.println("sum = " + sum);
            System.out.println(area - sum);

        }

    }

    public static class Area {

        public final int x;
        public final int y;
        public final int r;

        public Area(int x, int y, int r) {

            this.x = x;
            this.y = y;
            this.r = r;
        }

        public double area() {
            if ((this.y == 0) != (this.x == 0)) {
                return Math.PI * r * r * .5;
            }
            if (this.y == 0 && this.x == 0) {
                return Math.PI * r * r * .25;
            }
            return Math.PI * r * r;
        }

        public boolean overlapping(Area area) {
            double distance = Point.distance(area.x, area.y, this.x, this.y);
            return distance + area.r < r;
        }

//        public double areaOverlapping(Area area) {
//
//        }
    }

}
