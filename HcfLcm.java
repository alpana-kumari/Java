//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("enter the first number: ");
        int num2 = s.nextInt();

        int max = num1;
        
        int a = num1;
        int b = num2;

        if(max < num2){
            max = num2; 
        }

        int result = 1;

        for (int i = 1; i <= max; i++){
            if ( num1 % i == 0 && num2 % i == 0){
                result = result * i;
                num1 = num1 / i ;
                num2 = num2 / i ;

            }
        }

        int lcm = b*a / result ;
        System.out.println("HFC " + result);

        System.out.println("LCM " + lcm);

    }
}
