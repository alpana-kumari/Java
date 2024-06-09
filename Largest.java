import java.util.Scanner;

//Take 2 numbers as input and print the largest number

public class Largest {
    public static void main(String[] args){
        java.util.Scanner i = new Scanner(System.in);

        int num1 = i.nextInt();
        int num2 = i.nextInt();

        if (num1 > num2){

            System.out.println("The largest number is : " + num1);
        }

        else if (num2 > num1){
            System.out.println("The largest number is: " + num2);
        }

        else if (num1 == num2){
            System.out.println("BOTH ARE EQUAL ");
        }

        else {
            System.out.println("ERROR");
        }
    }
    
}
