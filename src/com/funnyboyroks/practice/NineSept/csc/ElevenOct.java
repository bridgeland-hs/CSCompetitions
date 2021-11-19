package com.funnyboyroks.practice.NineSept.csc;

import java.util.ArrayList;
import java.util.List;

public class ElevenOct {
    public static void main(String[] args) {
        String input = "\n6 15\nCar 1200 160\nWrench 15 5\nOmnitool 44 14\nPoster 6 2\nPaper 6 2\nLaser 18 6";
        String[] lines = input.split("\n");

        List<Item> items = new ArrayList<>();
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] parts = line.split(" ");
            int w = Integer.parseInt(parts[1]);
            int v = Integer.parseInt(parts[2]);
            items.add(new Item(parts[0], w, v));
        }


        items.sort((a,b) -> b.value - a.value);

        int weight = Integer.parseInt(lines[0].split(" ")[1]);
        int value = 0;
        int c = 0;
        for (Item item : items) {
            if(weight > item.weight) {
                int count = weight / item.weight;
                weight %= item.weight;
                value += count * item.value;
                c += count;
            } else if (weight == 0) {
                break;
            }
        }
        System.out.println(value + " - " + c);

    }

    public static class Item {

        public final String name;
        public final int value;
        public final int weight;

        public Item(String name, int value, int weight) {

            this.name = name;
            this.value = value;
            this.weight = weight;
        }
    }
}
