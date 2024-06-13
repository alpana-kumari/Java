import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int a = n;
        int result = 0;

        while (n>0){
            int rem = n % 10 ;
            result+=rem;
            n = n/10 ;
        }

        System.out.println("SUM OF DIGITS OF NUMBER " + a + "  IS " + result);
    }
    
}
