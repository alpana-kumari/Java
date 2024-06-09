import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = s.nextInt();

        int n = num % 10;
        int result = 0;

        while (n>0) {
            result = n + result*10  ;
            num = num/10;
            n = num % 10;
            
        }

        System.out.println("result " + result);
    }
    
}
