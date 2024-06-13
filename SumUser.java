//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


import java.util.Scanner;

public class SumUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        int result = 0;
        do{
            System.out.print("Enter the number: ");
            n = s.nextInt();
            result+=n;

        }
        while(n!= 0);
        System.out.println("result is: " +result);
        

    }
    
}
