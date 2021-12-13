package com.funnyboyroks.real._2021_10_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Seven {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("cat.txt");
        Scanner in = new Scanner(file);

        StringBuilder text = new StringBuilder();

        while(in.hasNextLine()) {
            text.append(in.nextLine());
            if(in.hasNextLine()) {
                text.append("\n");
            }
        }
        System.out.println(text);
    }
}
