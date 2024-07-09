import java.util.*;
public class whileloop{
    public static void main(String[] args) {
        /* TO PRINT HELLO WORLD 100 TIMES

        int n = 0;
        while(n<100){
            System.out.println("hello world");
            n++;
        }

        */
        /*  TO PRINT NUMBERS FROM 1 TO 100

        int n = 1;
        while(n<=1000){
            System.out.print(n + " ");
            n++;
        }
        
        */

        /* PRINT NUMBERS FROM 1 TO N

        Scanner scn = new Scanner(System.in);
        int range = scn.nextInt();
        int n = 1;
        while (range>=n){
            System.out.print( n + " ");
            n++;
        }
        */
    

        // TO PRINT SUM OF FIRST N NATURAL NUMBERS

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int i = 0;

        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("sum is : " + sum);

    }
}