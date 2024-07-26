package assignment_4;
import java.util.*;
public class Q5 {
    public static void main (String [] args ) {
//        Write a Java program to check if a number is perfect number or not.
//        (Hints: A number N is called perfect number, if the sum of factors except N as a factor is
//        equals to the number N.
//                Example:
//        N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)
//        Sample run1:
//        Enter a number: 496
//        496 is a perfect number.
//        Sample run2:
//        Enter a number: 490
//        490 is not a perfect number
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of n to check for perfectNumber :");
        float n = Sc.nextFloat();
        float sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;

            } else {
                sum = sum;
            }

            }
        if (sum == n) {
            System.out.println("The number is a perfect number .");
        } else {
            System.out.println("The number is not a perfect number .");
            }
        }
    }
