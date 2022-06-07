import java.util.Scanner;

public class drawXYZ2 {
    private static void DrawXYZ(int height){
        for (int i = 1; i <= height * height; i++){
            if (i % 3 == 0){
                System.out.print("X ");
            } else if (i % 2 == 0) {
                System.out.print("Z ");
            } else {
                System.out.print("Y ");
            }

            if (i % 5 == 0){
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        DrawXYZ(5);
    }
}
