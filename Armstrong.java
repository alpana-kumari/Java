//To find Armstrong Number between two given number

/*153:
Number of digits: 3
Calculation: 
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
Since the sum is equal to the number, 153 is an Armstrong number.
*/

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("enter the second number: ");
        int num2 = in.nextInt();
        int result = 0;
        for (int i = num1; i <= num2; i++){

            result = 0;

            String p = Integer.toString(i); // converting p from int to string or String p = " " + i;
            int power = p.length();
            
            for (int j = 0; j<power ; j++ ){
                char b = p.charAt(j);
                //System.out.println(b);
                int a = Character.getNumericValue(b);
                result = result + (int) Math.pow(a,power);
            }

            if(result == i){
                System.out.println("ARMSTRONG NUMBER : " + i );
            }
        }

    }
    
}
