import java.util.Scanner ; 
public class CtemperatureF {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in C: ");

        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32 ; 
        System.out.println("Temperature in farenhit : " + tempF);

    }
    
}
