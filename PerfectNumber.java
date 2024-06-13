//perfect number or not
// 6:

// Proper divisors: 1, 2, 3
// Sum of divisors: 1 + 2 + 3 = 6
// Since the sum of its divisors equals the number itself, 6 is a perfect number.

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int result = 0;
        for(int i = 1; i<= n/2; i++){
            if (n % i == 0){
                result +=i;
            }
        }

        if (result == n){
            System.out.println("PERFECT NUMBER");
        }
        else{
            System.out.println("NOT A PERFECT NUMBER");
        }
        
    }
    
}
