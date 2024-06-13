import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        int result = 0;
    
        while(n>0){
            int rem = n % 10 ;
            result = result * 10 + rem ;
            n = n / 10 ;
        }
        System.out.println(result);
        if (result == a){
            System.out.println("YES PALINDROME NUMBER");
        }
        else{
            System.out.println("NOT A PALINDROME NUMBER");
        }
        
    }
   
    
}
