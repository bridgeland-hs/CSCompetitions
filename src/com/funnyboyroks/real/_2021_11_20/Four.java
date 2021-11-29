package com.funnyboyroks.real._2021_11_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Four {
    public static int leave;
    public static int abandon;
    public static int time;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("water.dat"));

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            int pplz = Integer.parseInt(scanner.nextLine());
            List<Person> ppl = new ArrayList<>();
            List<Person> line = new ArrayList<>();
            leave = abandon = time = 0;
            for (int j = 0; j < pplz; j++) {
                List<Integer> parts = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                ppl.add(new Person(parts.get(0), parts.get(1), j));
            }
            for (int j = 0; j < ppl.size(); j++) {
                if (!ppl.isEmpty() && j % ppl.get(0).interval == 0) {
                    line.add(ppl.remove(0));
                }
                AtomicInteger n = new AtomicInteger();
                line = line.stream().filter((p) -> p.update(n.getAndIncrement())).collect(Collectors.toList());
            }


        }

//        double d = Double.parseDouble(scanner.nextLine());
//        String s = scanner.nextLine();

        // input of "n1 n2 n3" -> List of [n1, n2, n3] (ints)

    }

    public static class Person {

        public final int interval;
        public final int limit;
        public int time;
        public int position = 0;

        public Person(int interval, int limit, int position) {
            this.time = this.interval = interval;
            this.limit = limit;
            this.position = position;
        }

        public boolean update(int position) {
            if (this.position == 0) {
                this.time--;
                ++time;
                if (this.time == 0) {
                    return false;
                }
            }
            if (time > this.limit) {
                return false;
            }
            this.position = position;
            return true;
        }
    }

}
