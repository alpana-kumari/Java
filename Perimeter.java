import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the shape to calculate the Perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        System.out.println("6. Rhombus");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                circle();
                break;
            case 2:
                equilateralTriangle();
                break;
            case 3:
                parallelogram();
                break;
            case 4:
                rectangle();
                break;
            case 5:
                square();
                break;
            case 6:
                rhombus();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    // Perimeter Of Circle
    public static void circle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = s.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
    }

    // Perimeter Of Equilateral Triangle
    public static void equilateralTriangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = s.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of equilateral triangle is: " + perimeter);
    }

    // Perimeter Of Parallelogram
    public static void parallelogram() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of one side: ");
        double side1 = s.nextDouble();
        System.out.print("Enter length of the adjacent side: ");
        double side2 = s.nextDouble();
        double perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter of parallelogram is: " + perimeter);
    }

    // Perimeter Of Rectangle
    public static void rectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = s.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = s.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    // Perimeter Of Square
    public static void square() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = s.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of square is: " + perimeter);
    }

    // Perimeter Of Rhombus
    public static void rhombus() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = s.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of rhombus is: " + perimeter);
    }
}
