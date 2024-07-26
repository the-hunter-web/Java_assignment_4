package assignment_4;
import java.util.*;
import java.lang.Math;
public class Q8 {
    public static void main (String [] args) {
//        Write a program that generates a random integer number between 1 to 10 and asks the user to
//        guess what the number is. If the user's guess is higher than the random number, the program
//        should display "Too high, try again." If the user's guess is lower than the random number, the
//        program should display "Too low, try again." The program should use a loop that repeats until
//        the user correctly guesses the random number and display good guess.
//                Sample run:
//        Computer guess: 7
//        User guess: 5
//        Too low, try again
//        Computer guess: 5
//        User guess: 7
//        Too high, try again
//        Computer guess: 5
//        User guess: 5
//        Good guess
        Scanner Sc = new Scanner (System.in);
        int random = (int)((Math.random() * 10 ) + 1);

        int guess;
        do {
            System.out.println("Guess a number between 1-10 :");
            guess = Sc.nextInt();

            if ( guess > random) {
                System.out.println("Too high , try again");
            } else if (guess < random ) {
                System.out.println("Too low , try again");
            } else {
                System.out.println("Good guess ");
            }


        } while (random != guess);
        System.out.println("Random guess by computer was : " + random);
    }
}
