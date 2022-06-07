import java.util.Scanner;

public class ScoreConvert {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("input score: ");
        int studentScore = num.nextInt();

        if (studentScore>=80 && studentScore<=100)
            System.out.println("You got A");
        else if (studentScore>=65 && studentScore<=79) {
            System.out.println("You got B+");
        } else if (studentScore>=50 && studentScore<=64) {
            System.out.println("You got B");
        } else if (studentScore>=35 && studentScore<=49) {
            System.out.println("You got C");
        } else {
            System.out.println("You got D");
        }

    }
}
