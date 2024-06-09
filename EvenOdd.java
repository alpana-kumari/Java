import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();

        int result = num % 2 ;
        if(result == 0){
            System.out.println("YES IT IS EVEN");
        }

        else{
            System.out.println("IT IS ODD");
        }


    }

}