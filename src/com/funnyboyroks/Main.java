package com.funnyboyroks;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));

        Integer[] arr = { 0, 1, 2, 3 };
        List<Integer> n = Arrays.asList(arr);
        System.out.println(n);
        arr[1] = 10;
        System.out.println(n);
        n.add(4);
        System.out.println(n);


    }
}
