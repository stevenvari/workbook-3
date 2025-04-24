package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name of the employee file ");
            String inputFile = scanner.nextLine();

            System.out.println("Enter the name of the payroll output file to create: ");
            String output = scanner.nextLine();


            FileReader fileReader = new FileReader("DataFile/" + inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String headerLine = bufferedReader.readLine();
            String input;

            FileWriter fileWriter = new FileWriter("DataFile/" + output);
            fileWriter.write("id|name|gross pay\n");

            bufferedReader.readLine();

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
            fileWriter.close();



        } catch (IOException e) {
          System.out.println("Error reading file ");
        }

    }
}
