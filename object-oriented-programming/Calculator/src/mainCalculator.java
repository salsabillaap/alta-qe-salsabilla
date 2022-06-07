import java.util.Scanner;

public class mainCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float firstNumber = scan.nextInt();

        System.out.println("Enter second number: ");
        float secondNumber = scan.nextInt();

        CalVO operations = new CalVO();
        operations.setFirstNumber(firstNumber);
        operations.setSecondNumber(secondNumber);

        Calculations cal = new Calculations();
        float addResult = cal.add(operations.getFirstNumber(), operations.getSecondNumber());
        System.out.println("Addition Result = " + addResult);

        float subResult = cal.subs(operations.getFirstNumber(), operations.getSecondNumber());
        System.out.println("Subtraction Result = " + subResult);

        float mulResult = cal.mul(operations.getFirstNumber(), operations.getSecondNumber());
        System.out.println("Multiplication Result = " + mulResult);

        float divResult = cal.div(operations.getFirstNumber(), operations.getSecondNumber());
        System.out.println("Division Result = " + divResult);
    }
}
