import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        int l, b, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length=");
        l = sc.nextInt();
        System.out.println("Enter Breadth=");
        b = sc.nextInt();
        area = (l * b);
        System.out.println("Area of rectangle " + area);
        sc.close();
    }

}
