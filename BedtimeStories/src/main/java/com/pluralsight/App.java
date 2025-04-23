package com.pluralsight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String stories =("\"goldilocks\", \"hansel_and_gretel\" \"mary_had_a_little_lamb\"");
        System.out.println("which story would you like? " + stories);

        Scanner scanner = new Scanner(System.in);
        String storyName = scanner.nextLine();


        try {
            FileInputStream fis = new FileInputStream("DataFiles/" + storyName + ".txt");
            Scanner scanner1 = new Scanner(fis);


            String line;
            while (scanner1.hasNextLine()){
            line = scanner1.nextLine();
            System.out.println(line);
        }
        scanner.close();
        }catch (FileNotFoundException e){
           // System.out.println("file not found. ");
            System.out.println("File not found: " + "DataFiles/" + storyName);

        }






    }
}
