import java.util.Scanner;
public class AreaofRectangle {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle:");
        int Length = scanner.nextInt();
        System.out.println("Enter the Breadth of the rectange:");
        int Breadth = scanner.nextInt();
        float Area = Length *Breadth;
        System.out.printf("The area of the rectangle is:"+Area);
        scanner.close();
    }
}
