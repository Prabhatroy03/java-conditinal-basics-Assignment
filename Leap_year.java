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

              
