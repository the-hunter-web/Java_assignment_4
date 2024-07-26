package assignment_4;
import java.util.*;

public class Q4 {
    public static void main (String [] args ) {
//        Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
//        algorithm, which is an iterative computation based on the following observation: if y divides
//        x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
//        Sample run:
//        Enter the first number: 56
//        Enter the second number: 98
//        GCD of 56 and 98 is 14.
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the 1st number :");
        int x = Sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int y = Sc.nextInt();
        int remainder = 0;

        while (x % y != 0) {
            int temp = y;
            remainder = x % y;
             y = remainder;
             x = temp;
        }
        System.out.println("The highest common factor of is :" + y);
    }
}
