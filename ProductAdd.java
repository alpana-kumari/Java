import java.util.Scanner;

public class ProductAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mult = 1 ;
        int add = 0 ;
        
        while (n > 0){
            mult = mult * (n % 10) ;
            add = add + (n%10) ;
            n = n/10 ; 
        }

        int result = mult - add ;

        System.out.println("RESULT: " + result); 
        
    }

}