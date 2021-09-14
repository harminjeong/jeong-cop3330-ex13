/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = in.nextDouble();
        System.out.print("What is the rate? ");
        double rate = in.nextDouble();
        System.out.print("What is the number of years? ");
        double years = in.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        double compound = in.nextDouble();

        double total = Math.round(principal*Math.pow((1+(rate/(compound*100))), (compound*years))*100.0)/100.0;

        System.out.println("$"+principal+" invested at "+rate+"% for "+years+" years compounded "+compound+" times per year is $"+total+".");
    }
}
