package javaio;

import java.util.Scanner;

public class ScannerClassExample1 {

        public static void main(String args[]){
            String s = "Hello, This is JavaTutorial.";
            //Create scanner Object and pass string in it

            Scanner scan = new Scanner(s);
            //Check if the scanner has a token
            System.out.println("Boolean Result: " + scan.hasNext());
            //Print the string
            System.out.println("String: " +scan.nextLine());
            scan.close();

            System.out.println("--------Enter Your Details-------- ");
            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner2.next();
            System.out.println("Name: " + name);
            System.out.print("Enter your age: ");
            int i = scanner2.nextInt();
            System.out.println("Age: " + i);
            System.out.print("Enter your salary: ");
            double d = scanner2.nextDouble();
            System.out.println("Salary: " + d);
            scanner2.close();
        }
    }

