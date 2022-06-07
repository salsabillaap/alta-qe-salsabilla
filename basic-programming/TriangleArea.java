import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("input base (cm): ");
        float base = num.nextInt();
        System.out.print("input height (cm): ");
        float height = num.nextInt();

        double TriangleArea = 0.5 * base * height;
        System.out.println("The area of triangle is " + TriangleArea);
    }
}
