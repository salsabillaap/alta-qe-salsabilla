public class PersegiPanjang extends bangunDatar {
    double panjang, lebar;

    public PersegiPanjang (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double Luas() {
        return panjang * lebar;
    }

    @Override
    double Keliling() {
        return 2 * (panjang + lebar);
    }
}
