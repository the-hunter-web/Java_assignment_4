package assignment_4;

import java.util.*;

public class Q1 {
    public static void main (String [] args ) {
//        Write a java program that gets three integer numbers from the user. Count from the first number
//        to the second number increments by the third number. Use for loop to do it. Also, display the
//        sum of numbers displayed between the first number and second number.
//                Sample run:
//        Enter first number: 4
//        Enter second number: 13
//        Enter third number: 3
//        4 7 10 13
//        The sum of number displayed is 34

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the 1st number :");
        int a = Sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int b = Sc.nextInt();
        System.out.println("Enter the 3rd number :");
        int c = Sc.nextInt();
        int sum = 0;

        for ( int i = a ; i <= b ; i = i + c ){
            System.out.print(i + " ");
            sum = sum + i ;
        }
        System.out.println();

        System.out.println("The sum of the digits of the number displayed is : " + sum );

    }
}
