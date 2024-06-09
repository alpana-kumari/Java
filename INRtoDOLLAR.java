//Input currency in rupees and output in USD.
import java.util.Scanner;

public class INRtoDOLLAR {
    public static void main(String[] args){

        Scanner i = new Scanner(System.in);
        System.out.print("ENTER AMOUNT IN INR: ");
        double INR = i.nextDouble();
        double result = INR * 0.012 ;

        System.out.println("AMOUNT IN DOLLAR IS : " + result);
    }
    
}
