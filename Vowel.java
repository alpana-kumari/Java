import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = s.nextLine().trim();
        int length = str.length();
        int count = 0;

        for (int i =0; i < length; i++){
            char c = str.charAt(i);
            String cs = "" + c;
            

            if (cs.equals("a") || cs.equals("e") || cs.equals("i") ||cs.equals("o") || cs.equals("u") ||
            cs.equals("A") ||cs.equals("E") ||cs.equals("I") ||cs.equals("O") ||cs.equals("U")){
                count+=1;

            }
        }

        System.out.println("Total number of vowels in the string is: " + count);
    }

}