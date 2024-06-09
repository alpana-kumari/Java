//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the string: ");
        String input = in.next();

        int length = input.length();

        boolean result = true;

        for(int i = 0; i < (length/2) ; i++ ){
            char start = input.charAt(i);
            char end = input.charAt(length - i-1);

            if (start != end){
                result = false;
                break;
            }
        }

        if (result == false){
            System.out.println("NOT A PALINDROME");
        }
        else{
            System.out.println("IT IS A PALINDROME");
        }

    }
    
}
