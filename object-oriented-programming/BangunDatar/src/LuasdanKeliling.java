public class LuasdanKeliling {
    public static void main(String[] args) {
        bangunDatar bangundatar = new bangunDatar();
        PersegiPanjang persegipanjang = new PersegiPanjang(7, 8);
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(3, 4);

        bangundatar.Luas();
        System.out.println("Luas persegi adalah " + persegi.Luas());
        System.out.println("Luas persegi panjang adalah " + persegipanjang.Luas());
        System.out.println("Luas segitiga adalah " + segitiga.Luas());


        System.out.println("");

        bangundatar.Keliling();
        System.out.println("Keliling persegi adalah " + persegi.Keliling());
        System.out.println("Keliling persegi panjang adalah " + persegipanjang.Keliling());
        System.out.println("Keliling segitiga adalah " + segitiga.Keliling());
    }
}
