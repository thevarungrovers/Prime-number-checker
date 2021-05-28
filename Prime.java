
package prime_number;

import java.util.Scanner;


public class Prime {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        boolean isPrime = true;
        
        System.out.println("Enter a posiive number : ");
        int num = s.nextInt(); // input 
        
        if(num < 0 || num == 0 ){ // condition for positive or non-zero number
            System.out.println("Please enter a positive or a non-zero number !! ");
        }
//        prime number checking
        else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println(num + " IS A PRIME NUMBER");
            }
            else{
                System.out.println(num + " IS NOT A PRIME NUMBER");
            }
        }
    }
}
