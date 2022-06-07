public class Tabung extends BangunRuang{
    double phi = 3.14;
    double r, t;

    public Tabung (double r, double t){
        this.r = r;
        this.t = t;
    }

    @Override
    double volume() {
        return phi * r * r * t;
    }
}
