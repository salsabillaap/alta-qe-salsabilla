public class Segitiga extends bangunDatar{
    double alas, tinggi;
    double m = Math.sqrt(alas * alas + tinggi * tinggi);

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double Luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double Keliling() {
        return alas + tinggi + m;
    }
}
