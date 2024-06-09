import java.util.Scanner;
public class Inputt2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer :");
        int a = input.nextInt();        
        
        System.out.println("Enter the string: ");
        String b = input.next();
        
        System.out.println("Enter the whole line: ");
        String c = input.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    
}
