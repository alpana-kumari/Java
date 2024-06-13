//Kunal is allowed to go out with his friends only on the even days of a given month. 
//Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aug = 31 ;
        int count = 0;

        for (int i = 1; i <=aug; i++){
            if( i % 2 == 0){
                count+=1;
            }
        }
        System.out.println("NO. OF DAYS HE CAN GO OUT IN AUG IS: " + count);
    }
    
}
