import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input bilangan: ");
        int Bilangan = input.nextInt();

        System.out.println("Faktor dari bilangan " + Bilangan + " " + "adalah ");

        for (int i = 1; i <= Bilangan; ++i){
            if (Bilangan % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
