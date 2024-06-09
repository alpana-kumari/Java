import java.util.Scanner;

public class NumCheck1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        System.out.print("Enter the number to be counted: ");
        int find = s.nextInt();

        String str = Integer.toString(n); 
        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++){

            char a = str.charAt(i);
            int b = Character.getNumericValue(a);

            if(b == find){
                count+=1;

            }
        }
        System.out.println("number of times " + find + " is present in " + n + " is: "+ count);
    }
    
}
