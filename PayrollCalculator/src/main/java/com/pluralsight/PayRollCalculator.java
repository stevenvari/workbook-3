package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayRollCalculator {
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("DataFile\\employees.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String headerLine = bufferedReader.readLine();

            String input;

            while ((input = bufferedReader.readLine()) != null){
                System.out.println(input);
                String[] tokens = input.trim().split("\\|+");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);
                double grossPay = 0.0;
                Employee employee = new Employee(employeeId, name,hoursWorked,payRate,grossPay );

                System.out.printf("ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());


            }
            bufferedReader.close();


        } catch (IOException e) {
           // throw new RuntimeException(e);
        }
    }
}
