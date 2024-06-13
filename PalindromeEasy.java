import java.util.Scanner;
public class PalindromeEasy {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int length = str.length();
        String rev = "";

        for (int i = length-1; i>= 0; i--){
            char c = str.charAt(i);
            rev = rev + c;
        }

        if ( str.equals(rev)){
            System.out.println("YES IT IS A PALINDROME");
        }
        else{
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}




