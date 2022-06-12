package dsa_practice;

// 1.Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year % 4==0){
            System.out.println("Leap Yaer: "+year);
        }
        else{
            System.out.println("Not leap year: "+year);
        }
    }

}

                2.Take two numbers and print the sum of both.
                        3.Take a number as input and print the multiplication table for it.
                        4.Take 2 numbers as inputs and find their HCF and LCM.
                        5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
                        */