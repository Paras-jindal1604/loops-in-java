import java.util.*;
public class dowhileloop {
    public static void main(String args[]){
        /* 
        int i = 1;
        do{
            System.out.println("hello world");
            i++;
        }while(i<=10);
    }
    */

    // print till multiple of 10 from user using  BREAK
    /* 
    Scanner scn = new Scanner(System.in);
    do{
        System.out.println("enter your number: ");
        int n = scn.nextInt();
        if(n%10 == 0){
            break;
            
        }
        System.out.println(n);

    } while(true);
     */

     // print all numbers except multiple of 10 using CONTINUE

     Scanner scn = new Scanner(System.in);
     do{
        System.out.println("enter your number: ");
        int n = scn.nextInt();
        if(n%10 == 0){
            continue;
        }
        System.out.println("number was " + n);
     }while(true);
    }
    
}
