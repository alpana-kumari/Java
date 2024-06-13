import java.util.Scanner;

public class LargestUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        int result = 0;
        do{
            System.out.print("Enter the number: ");
            n = s.nextInt();
            if (n>result){
                result = n;

            }
            

        }
        while(n!= 0);
        System.out.println("result is: " +result);
        

    }
    
}
