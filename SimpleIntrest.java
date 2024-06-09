import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        System.out.print("ENTER THE PRINICIPAL AMOUNT : ");
        float P = i.nextFloat();

        System.out.print("ENTER THE TIME PERIOD : ");
        float T = i.nextFloat();

        System.out.print("ENTER THE RATE OF INTREST : ");
        float R = i.nextFloat();


        float  SI = P * R * T / 100;
        System.out.println("SIMPLE INTREST IS : " + SI);

    }
    
}
