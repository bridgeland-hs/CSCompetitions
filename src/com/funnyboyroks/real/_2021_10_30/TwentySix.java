package com.funnyboyroks.real._2021_10_30;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> ppl = new ArrayList<>();
        List<Person> men = new ArrayList<>();
        List<Person> wom = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            Person p = new Person(scanner.nextLine());
            ppl.add(p);
            (p.male ? men : wom).add(p);
        }
        ppl.sort(Comparator.comparingInt(p -> p.time));
        men.sort(Comparator.comparingInt(p -> p.time));
        wom.sort(Comparator.comparingInt(p -> p.time));

        System.out.println(ppl.get(0));
        System.out.println(ppl.get(1));
        System.out.println(men.get(0));
        System.out.println(men.get(1));
        System.out.println(wom.get(0));
        System.out.println(wom.get(1));
    }

    private static class Person {
        public String name;
        public int time;
        public boolean male;

        public Person(String data) {
            String[] parts = data.split(" ");
            this.name = parts[0];
            this.time = Integer.parseInt(parts[1]);
            this.male = parts[2].equalsIgnoreCase("m");
        }

        @Override
        public String toString() {
            return name + " " + time + " " + (male ? "M" : "F");
        }
    }
}
