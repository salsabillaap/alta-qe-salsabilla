public class Persegi extends bangunDatar {
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    double Luas() {
        return sisi * sisi;
    }

    @Override
    double Keliling() {
        return 4 * sisi;
    }
}
