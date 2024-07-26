package assignment_4;

import java.util.*;
import java.lang.Math;

public class Q3 {
    public static void main (String [] args ) {
//        Write a java program that takes an integer N from user, uses
//        Math. Random () to print N random integer numbers between 1 to N, and then prints their
//        average value. Use do while loop.
//                Sample run:
//        Enter a number: 6
//        Random numbers generated are: 6 4 5 2 2 5
//        Average of 6 random numbers are 4

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = Sc.nextInt();
        float sum = 0;
        int i = 0;

        do {
            int random = (int) ((Math.random() * n) + 1);
            sum = sum + random;
            i++;
            System.out.print( random + " ");
        } while (i <= n);
        float average = (sum / n);
        System.out.println("The average of random guesses by computer is " + average );
    }
}
