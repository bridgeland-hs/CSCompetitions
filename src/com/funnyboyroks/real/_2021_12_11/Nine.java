package com.funnyboyroks.real._2021_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Nine {

//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("grades.dat"));
//
//        int sets = scanner.nextInt();
//        for (int i = 0; i < sets; i++) {
//            int s = scanner.nextInt();
//            int grades = scanner.nextInt();
//            Map<String, Double> students = new HashMap<>();
//            for (int j = 0; j < s; j++) {
//                String k = scanner.next();
//                double count = 0;
//                int grade = 0;
//                gl:
//                for (int l = 0; l < grades; l++) {
//                    String n = scanner.next();
//                    int z = 0;
//                    switch (n) {
//                        case "Z" -> {
//                        }
//                        case "X" -> {
//                            break gl;
//                        }
//                        default -> z = Integer.parseInt(n);
//                    }
//                    count++;
//                    if (n.equals("0")) {
//                        continue;
//                    }
//                    grade += z;
//                }
//                students.put(k, grade / count);
//            }
//            List<Map.Entry<String, Double>> l = students.entrySet().stream().sorted(Comparator.comparingDouble(Map.Entry::getValue)).collect(Collectors.toList());
//            Collections.reverse(l);
//            double d = Math.round(l.get(0).getValue() * 100) / 100.0;
//            String[] parts = (d + "").split("\\.");
//            parts[1] += "0000000";
//            parts[1] = parts[1].substring(0, 2);
//            String str = String.join(".", parts);
//            System.out.println(l.get(0).getKey() + " " + str);
//
//
//        }
//
//    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("grades.dat"));

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int studentCount = scanner.nextInt();
            int gradeCount = scanner.nextInt();
            Map<String, Double> students = new HashMap<>();
            for (int j = 0; j < studentCount; j++) {
                String name = scanner.next();
                List<Integer> grades = new ArrayList<>();

                for (int k = 0; k < gradeCount; k++) {
                    String grade = scanner.next();
                    switch (grade) {
                        case "X" -> {}
                        case "Z" -> grades.add(0);
                        default -> grades.add(Integer.parseInt(grade));
                    }
                }

                double avg = grades.stream().reduce(0, Integer::sum) / (double) grades.size();

                students.put(name, avg);
            }
            List<Map.Entry<String, Double>> studentsSorted = students.entrySet().stream().sorted(Comparator.comparingDouble(Map.Entry::getValue)).collect(Collectors.toList());
            Collections.reverse(studentsSorted);

            Map.Entry<String, Double> e = studentsSorted.get(0);
            double d = Math.round(e.getValue() * 100) / 100.0;
            String[] parts = (d + "").split("\\.");
            parts[1] += "0000000";
            parts[1] = parts[1].substring(0, 2);
            System.out.println(e.getKey() + " " + String.join(".", parts));
        }

    }

    public static double avg(List<Integer> ints, int c) {
        int sum = ints.stream().reduce(0, Integer::sum);
        return sum / (double) c;
    }

}
