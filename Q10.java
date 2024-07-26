package assignment_4;
import java.util.*;
public class Q10 {
    public static void main (String [] args) {
//        Write a java program to print largest power of three less than or equal to N.
//        Sample run:
//        Enter a number: 100
//        The largest power of 3 less than or equal to 100 is 81
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int p = 1;
        for (int i = 1 ;i < n ; i++) {
            p = p*3;
            if (p >= n)
                break;
        }
        System.out.println(p/3);
    }
}
