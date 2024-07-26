package assignment_4;
import java.util.*;
public class Q9 {
    public static void main (String [] args ) {
//        Write a java program to take an integer input from the user and print the input by removing all
//        zeros.
//                Example: Input = 10200 then Output = 12.
//        Sample run:
//        Enter an integer number: 10203040
//        After removing 0 from number 10203040, the new number is 1234.
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter a number that includes zero in it :");
        int n = Sc.nextInt();
//        int rem = 0;
        String a = "";

        for (n = n ; n != 0 ; n = n/10) {
            if (n % 10 != 0 ) {
                a = (n%10) + a;
            } else {
                a = a;
            }
        }
        System.out.println(a);
    }
}
