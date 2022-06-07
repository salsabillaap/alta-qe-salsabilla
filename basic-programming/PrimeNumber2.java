public class PrimeNumber2 {
    public static boolean primenumber(int number) {

        boolean flag = true;
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                flag = false;
//                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(primenumber(7));
        System.out.println(primenumber(10));
        System.out.println(primenumber(11));
        System.out.println(primenumber(13));
    }
}

