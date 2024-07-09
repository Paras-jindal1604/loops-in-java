import java.util.*;
public class practiceques {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // to find factorial of an entered number
        /* 
        int n = scn.nextInt();
        int fact = 1;

        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.println("factorial of " + n+ " is " + fact);

        */

        // to print multiplication table of a number n

        int n = scn.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println( n + " x " + i + " = " + n*i);
        }
       
    }
    
}
