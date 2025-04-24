package com.pluralsight;

import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("The hunger games");
        books.add("Lord of the Flies");
        books.add("Love some Austen");
        System.out.println(books);

        System.out.println(books.get(0));
        books.remove(1);
        System.out.println(books);



        
    }
}
