import java.util.*;
public class forloop {
    public static void main(String args[]){

    // to print hello world 10 times
    /* 
    for( int i = 1; i<=10; i++){
        System.out.println("hello world");
    }
    */

    // TO PRINT SQUARE PATTERN
     
    /*  
    for(int line = 1; line<=4; line++){
        System.out.println("* * * *");
    }
    }
     */
        // PRINT REVERSE OF A NUMBER
        /* 
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     while(n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit + " ");
        n = n/10;
    
     }
     */

     // TO REVERSE A GIVEN NUMBER

    Scanner scn = new Scanner(System.in);
    System.out.println("enter the number");
    int n = scn.nextInt();
    int rev = 0;
    while (n>0){
        int lastdigit = n%10;
        rev = (rev*10) + lastdigit;
        n = n/10;
    }
    System.out.println("reverse of number is: " + rev);
    }
}
