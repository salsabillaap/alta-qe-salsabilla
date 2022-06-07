import java.util.Scanner;

public class Palindrome {
    private static boolean palindrome (String word){
        int i = 0;
        int j = word.length() - 1;
        boolean flag = false;

        while (i < j) {
            if (word.charAt(i) == word.charAt(j)){
                return true;
            }
            j--;
        } return flag;
    }


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("masukan kata: ");
        String kata = str.nextLine();

        System.out.println(palindrome(kata));
    }
}
