package assignment_4;

import java.util.*;
public class Q2 {
    public static void main (String [] args ) {
//        An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
//        program to determine whether or not the number is divisible by 9. Test it on the following
//        numbers: Use while loop.
//                n = 123456
//        n = 154368
//        n = 621594
//        Hint: Use the % operator to get each digit; then use / operator to remove the digit.
//                Sample run 1:
//        Enter a number: 154368
//        The number 154368 is divisible by 9.
//        Sample run 2:
//        Enter a number: 123456
//        The number 123456 is not divisible by 9.

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the value of n to check for the divisibility with 9 :");
        int n = Sc.nextInt();
        int sum = 0;

        while (n != 0) {
            sum = sum + (n%10);
            n = (n/10);
        }
//        System.out.print(sum);
        if (sum % 9 == 0) {
            System.out.println( "The number is divisible by 9");
        } else {
            System.out.println("The number is not divisible by 9 ");
        }
        }

    }

