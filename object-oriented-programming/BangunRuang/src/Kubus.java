public class Kubus extends BangunRuang{
    double s;

    public Kubus(double s){
        this.s = s;
    }

    @Override
    double volume() {
        return s * s * s * s;
    }
}