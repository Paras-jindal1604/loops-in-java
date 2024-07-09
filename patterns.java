import java.util.*;
public class patterns {
    public static void main(String args[]){
        /* STAR PATTERN

        for(int line = 1; line<=4; line++){
            for(int star =1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /* INVERTED STAR PATTERN

        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* HALF PYRAMID NUMBERS PATTERN

        int n = 4;
        for(int i = 1; i<= n; i++){
            for(int number = 1; number<=i; number++){
                System.out.print(number);
            }
            System.out.println();
        }
        */

        // CHARACTER CONTINUE PATTERN
        char ch = 'A';
        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
