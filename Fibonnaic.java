//To calculate Fibonacci Series up to n numbers.


import java.util.Scanner;

public class Fibonnaic {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the ending point: ");
        int num = in.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);
    
        for ( int i = 0; i <= num-1; i++){

            int result = num1 + num2 ;
            System.out.println(result);

            num1 = num2;
            num2 = result ; 

        }


    }
    
}
