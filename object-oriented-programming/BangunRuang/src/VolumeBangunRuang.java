public class VolumeBangunRuang {
    public static void main(String[] args) {
        BangunRuang bangunruang = new BangunRuang();
        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3, 6, 10);
        Tabung tabung = new Tabung(7, 10);

        bangunruang.volume();
        System.out.println("Volume kubus adalah " + kubus.volume());
        System.out.println("Volume balok adalah " + balok.volume());
        System.out.println("Volume tabung adalah " + tabung.volume());
    }
}
