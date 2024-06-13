// Reverse A String In Java
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int length = str.length();
        String rev = "";

        for (int i = length-1; i>= 0; i--){
            char c = str.charAt(i);
            rev = rev + c;
        }

        System.out.println("REVERSED STRING IS: " + rev);
    }
}





