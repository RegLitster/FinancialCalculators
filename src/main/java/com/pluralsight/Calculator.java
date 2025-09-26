package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what calculator you would like to do use \n 1. Mortgage Calculator \n 2. Future Value \n 3. Present Value");
        System.out.println("Option: ");
        int option = input.nextInt();

        if (option == 1) {
            mortgageCal();
        } else if (option == 2) {
            futureValCal();
        } else if (option == 3) {
            presentValueCal();
        } else {
            System.out.println("Invalid option. Please try again");
        }
    }
    public static void presentValueCal(){

    }
    public static void futureValCal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your deposit:");
        double deposit = input.nextDouble();
        System.out.println("Please enter your interest:");
        double interest = input.nextDouble()/100;
        System.out.println("Please enter the length of the deposit in years");
        int lengthOfYears = input.nextInt();

        //FV = P × (1 + (r / 365) )^(365 × t)
        double interestAfter = interest/365;
        double lengthAfter = lengthOfYears*365;
        double futureVal = deposit * Math.pow(1+(interestAfter),lengthAfter);

        System.out.printf("The future value is: $%.2f\n", futureVal);
        double interestVal = futureVal - deposit;
        System.out.printf("Your total interest earned is: $%.2f", interestVal);

    }
    public static void mortgageCal(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the loan amount: ");
        int principal = input.nextInt();
        System.out.println("Please enter the loan interest rate: ");
        double rate = input.nextDouble()/100;
        System.out.println("Please enter the length of the loan in years: ");
        int years = input.nextInt();
        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1
        int numbermonthlypayment = 12 * years;

        double decimalrate = rate/12;

        double monthlypayment = principal *
                (

                    decimalrate * Math.pow(1+decimalrate, numbermonthlypayment)
                    /
                        (
                                Math.pow(1+decimalrate, numbermonthlypayment) -1 // This looks less nice than what I was trying to do but it works
                        )

                );

        double totalpayment = monthlypayment * numbermonthlypayment;
        double totalinterest = totalpayment - principal;
        System.out.printf("Your loan amount is: $%.2f\nYour total interest is: $%.2f\nYour total payment is: $%.2f " , monthlypayment,totalinterest,totalpayment);



    }



































}
