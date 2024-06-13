// factorial of a number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");
        long n = s.nextLong();
        long fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact * i ;
        }

        System.out.println("result: " + fact);
        
    }
    
}
