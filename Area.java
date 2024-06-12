import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        System.out.println("Welcom to this program: ");
    }

// Area Of Circle Java Program
    public static void CIRCLE(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = s.nextDouble();
        
        double area = 3.14 * Math.pow(radius,2);
        System.out.println("Area of circle is: " + area);
    }

// Area Of Triangle
    public static void TRIANGLE(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = s.nextDouble();
        
        System.out.print("Enter height: ");
        double height = s.nextDouble();
        
        double area = 0.5 * base * height ;
        System.out.println("Area of circle is: " + area);
    }

// Area Of Rectangle Program
    public static void RECTANGLE(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = s.nextDouble();
        
        System.out.print("Enter breadth: ");
        double breadth = s.nextDouble();
        
        double area = 0.5 * length * breadth ;
        System.out.println("Area of circle is: " + area);
    }

// Area Of Isosceles Triangle
    public static void IsoscelesTRIANGLE(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 1st side(isosceles side): ");
        double side1 = s.nextDouble();
        
        System.out.print("Enter 2nd side: ");
        double side2 = s.nextDouble();

        double height = Math.sqrt(Math.pow(side1,2) - Math.pow(side2/2,2));
        
        double area = 0.5 * side2 * height ;
        System.out.println("Area of circle is: " + area);
    }



// Area Of Parallelogram
    public static void Parallelogram(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = s.nextDouble();
        
        System.out.print("Enter height ");
        double height = s.nextDouble();
        
        double area = base * height ;
        System.out.println("Area of circle is: " + area);
    }




// Area Of Rhombus
    public static void Rhombus(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = s.nextDouble();
        
        System.out.print("Enter height ");
        double height = s.nextDouble();
        
        double area = base * height ;
        System.out.println("Area of circle is: " + area);
    }



// Area Of Equilateral Triangle
    public static void EquilateralTriangle(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = s.nextDouble();
        
        double area = Math.sqrt(3) * Math.pow(2,side);
        System.out.println("Area of circle is: " + area);
    }    
}
