//Take a number and print hte table of it 
import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();
        
        for(int i = 1; i <= 10 ; i++ ){
            System.out.println(num*i);
        }
    }
}