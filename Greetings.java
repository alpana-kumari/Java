import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.

public class Greetings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NAME: ");

        String name = input.nextLine();

        System.out.println("HELLO! WELCOME TO JAVA " + name);

    }
    
}
