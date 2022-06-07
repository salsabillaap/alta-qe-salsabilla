public class Balok extends BangunRuang{
    double p, l , t;

    public Balok (double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    double volume() {
        return p * l * t;
    }
}
