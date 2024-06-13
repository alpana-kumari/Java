/*Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of 
positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the 
user enters a zero. */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Total Numbers");
        int n = s.nextInt();
        int sumP = 0;
        int sumN = 0;
        int sumPOdd =0;
        int sumNOdd = 0; 
        for(int i = 1; i <= n; i++){
            System.out.print("enter the number: ");
            int num = s.nextInt();

            if ( num < 0){
                sumN-=1;
                if ( num % 2 != 0){
                    sumNOdd -=1;
                }
            }

            else if ( num > 0){
                sumP+=1;
                if ( num % 2 != 0){
                    sumPOdd +=1;
                }
            }

            else if (num == 0){
                break;
            }
            
        }
        System.out.println("SUM OF +VE NUMBERS: "+ sumP);
        System.out.println("SUM OF -VE NUMBERS: " + sumN);
        System.out.println("SUM OF +VE ODD NUMBERS: " + sumPOdd);
        System.out.println("SUM OF - VE ODD NUMBERS: " + sumNOdd);
        
    }
    
}
