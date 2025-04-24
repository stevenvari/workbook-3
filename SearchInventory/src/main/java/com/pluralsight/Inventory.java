package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static void main(String[] args) {
        getInventory();
        List<Product> listOfProducts = getInventory();
        for (Product p : listOfProducts) {
            System.out.println(p);
        }
    }


    public static List<Product> getInventory() {
        List<Product> products = new ArrayList<>();
        Product soda = new Product(0, "1", 2);
        Product ranch = new Product(0, "2", 1.2);

        products.add(soda);
        products.add(ranch);


        return products;


    }

}

