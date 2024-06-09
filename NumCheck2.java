import java.util.Scanner;

public class NumCheck2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        System.out.print("Enter the number to count: ");
        int find = s.nextInt();

        int count = 0;

        while(num>0){
            int reminder = num % 10;
            if(reminder == find){
                count+=1;
            }
            num = num/10;
        }

        System.out.println("Count = " + count);
    }
    
}
