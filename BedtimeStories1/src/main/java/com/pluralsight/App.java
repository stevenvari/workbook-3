package com.pluralsight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String stories =("\"Goldilocks\", \"Hansel & Gretel\" \"Mary had a little lamb\"");
        System.out.println("which story would you like? " + stories);

        Scanner scanner = new Scanner(System.in);
        String storyName = scanner.nextLine();


        try {
            FileInputStream fis = new FileInputStream("DataFiles/" + storyName);
            Scanner scanner1 = new Scanner(fis);
            String storyChoice;

            String line;
            while (scanner1.hasNextLine()){
            line = scanner1.nextLine();
            System.out.println(line);
        }
        scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found. ");

        }






    }
}
