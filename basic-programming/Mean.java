public class Mean {
    private static float mean(float[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        float rata_rata = sum / numbers.length;
        return rata_rata;
    }

    public static void main(String[] args) {
        float[] nilai = {1, 2, 3, 4, 5};
        System.out.println(mean(nilai));
    }
}
