package model;
import repository.GeometrijskiLik;

public class Krug extends GeometrijskiLik {

    private double polumjer;

    public Krug(String naziv, double polumjer) {
        super(naziv);
        this.polumjer = polumjer;
    }

    public double getPolumjer() {
        return polumjer;
    }

    public void setPolumjer(double polumjer) {
        this.polumjer = polumjer;
    }

    @Override
    public double povrsina() {
        return (Math.PI * Math.pow(polumjer, 2));
    }

    @Override
    public double opseg() {
        return (2 * Math.PI * polumjer);
    }
}
