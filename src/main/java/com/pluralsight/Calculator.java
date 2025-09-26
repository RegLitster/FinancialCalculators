package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    mortgageCal();


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
                                Math.pow(1+decimalrate, numbermonthlypayment) -1 // This looks less nice that what I was trying to do but it works
                        )

                );

        double totalpayment = monthlypayment * numbermonthlypayment;
        double totalinterest = totalpayment - principal;
        System.out.printf("Your loan amount is: $%.2f\n Your total interest is $%.2f " , monthlypayment,totalinterest);


    }



































}
