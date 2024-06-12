//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = s.nextInt();

        for (int i = 1; i <= n/2; i++){
            if ( n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
    
}
