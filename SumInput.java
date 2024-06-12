//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = 0;
        boolean temp = true;
        while(temp != false){

            System.out.print("enter the number: ");
            int num = s.nextInt();
            
            result = result + num ;

            System.out.print("want to continue?(enter 'x' for not)");
            char input = s.next().trim().charAt(0);

            if (input == 'x'){
                temp = false;
            }

        }
        System.out.println("sum is: " + result);

        
    }
    
}
