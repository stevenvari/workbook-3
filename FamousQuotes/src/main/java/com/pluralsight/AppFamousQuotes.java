package com.pluralsight;

import java.util.Scanner;

public class AppFamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] famousQuotes = {"The purpose of our lives is to be happy",
                "Life is a series of lessons which must be lived to be understood.",
                "Life is like a breathtaking ride on a bicycle, full of challenges and unpredictable curves.",
                "The only impossible journey is the one you never begin.","The best way to predict the future is to create it.",
                "Success consists of going from failure to failure without loss of enthusiasm.",
                "Every strike brings me closer to the next home run.","Life has no limitations, except the ones you make.",
                "Love the life you live, live the life you love.","Life has no limitations, except the ones you make."};

        System.out.println("Enter a number between 1 - 10 for choose a quote : ");
        int number = scanner.nextInt();
        try {
            System.out.println("your quote is: " + famousQuotes[number -1]);
        }catch (Exception e){
            System.out.println("your number was out of range! ");
        }






        scanner.close();

    }
}
