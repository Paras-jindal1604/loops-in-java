import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean n_isprime = true;

        if(n == 2){
            System.out.println(" The number  " + n+ " is Prime.");
        }else{
            for(int i = 2; i<=Math.sqrt(n) ; i++){
                if(n%i == 0){                      // n is divisible by i where i is not equal to 1 or n
                    n_isprime = false;
                }
            }
    
            if(n_isprime == true){
                System.out.println(" The number  " + n+ " is Prime.");
            } else{
                System.out.println("The number" + n+ " is not-Prime.");
            }
        }
        
    }    
}
