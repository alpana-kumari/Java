import java.util.Scanner;

public class TypeCasting4{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("enter the number: " ); 
        int num = s.nextInt();
        System.out.println("number is : " + num);

        float num1 = s.nextFloat();
        float num3 = s.nextFloat();

        float sum = num1 + num3;
        System.out.println("sum is " + sum);
        // IF we enter two integer values in num1 and num3 the result will be float and this is know as the type conversion

        int num4  = (int) (568.87f);
        // type casting 
        // explictiely converting float type to integer 

        // automatic type promotion in expressions 
        int i = 257;
        byte c = (byte) (i);// ouput will be 257 % 256 = 1 
        System.out.println((c));
        // range of byte is 256 i.e max value that can be stored is 256 


        int number = 'A';
        System.out.println("It will print the ASCII value of 'A' i.e : " + number);


        System.out.println("नमस्ते");// java follows unicode 

        // 1. all  the byte, short and character values are promoted to integer for intermediate calculations.
        // 2. if operation is in long whole  will be promoted to long 
        // 3. if operation is in float whole will be promoted to float 
        // 4. if operation is in double whole will be promoted to double  


        // All type promotion will be covered here below example 

        byte be = 42;
        char ca ='a';
        short s =1024 ; 
        int ii = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *be) / (ii /ca) - (d - ca);

        System.out.println((f*be) + " " +  (ii/ca) + " " + (d-ca));
        System.out.println("result is " + result ); 
    }

}