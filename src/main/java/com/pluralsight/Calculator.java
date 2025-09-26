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
        double rate = input.nextDouble();

        System.out.println("Please enter the length of the loan in years: ");
        int years = input.nextInt();

        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1
        int monthlypayment = years * 12;
        double totalInterest = ((principal*monthlypayment)-principal);
        double decimalrate = rate/12/100;

        double factor = Math.pow(1 + decimalrate,monthlypayment);
        monthlypayment = (int) (principal*(decimalrate*factor) / (factor - 1));


        double total = principal * (decimalrate / factor) / (factor - 1);
        System.out.printf("Your loan amount is: %.2f " , total);


    }



































}
