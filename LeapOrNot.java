// Input a year and find whether it is a leap year or not.

import java.util.Scanner;
public class LeapOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year % 4 != 0){
            if (year % 100 != 0){
                if ( year % 400 == 0 ){
                    System.out.println("IT IS A LEAP YEAR: ");
                }
            }
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
    
}
