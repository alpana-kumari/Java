import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Calculator {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the operand : ");
        String operand = in.next();

        if ( operand.equals("+")){
            double result = num1 + num2 ;
            System.out.println("RESULT IS : " + result);
        }
        else if ( operand.equals("-")){
            double result = num1 - num2 ;
            System.out.println("RESULT IS : " + result);
        }
        else if ( operand.equals("*")){
            double result = num1 * num2 ;
            System.out.println("RESULT IS : " + result);
        }
        else if ( operand.equals("/")){
            double result = num1 / num2 ;
            System.out.println("RESULT IS : " + result);
        }
        else if ( operand.equals("%")){
            double result = num1 % num2 ;
            System.out.println("RESULT IS : " + result);
        }

        else {
            System.out.println("ERROR");
        }

    }
    
}
