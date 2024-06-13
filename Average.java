// Calculate Average Of N Numbers
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total numbers: ");
        int totalnum = s.nextInt();
        int total = 0;
        for (int i = 1; i<=totalnum; i++){
            System.out.print("enter the number: ");
            int num = s.nextInt();
            total = total + num;
        }
        
        int result = total / totalnum ;
        System.out.println("result: " + result);
        
    }
    
}
