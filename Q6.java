package assignment_4;
import java.util.*;
public class Q6 {
    public static void main (String [] args) {
//        Write a java program to enter two numbers through the keyboard. Write a program to find the
//        value of one number raised to the power of another. (Do not use Java built-in method).
//        Sample run:
//        Enter the base: 5
//        Enter the power: 4
//        5 to the power 4 is: 625
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the value of the base :");
        int base = Sc.nextInt();
        System.out.println("Enter the value of power :");
        int power = Sc.nextInt();
        int result = 1;

        for (int i = 1 ; i <= power ; i++) {
            result = base * result;
        }
        System.out.println(result);

    }
}
