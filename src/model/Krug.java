package model;

public class Krug {

    private String naziv;
    private double polumjer;

    public Krug(String naziv, double polumjer) {
        this.naziv = naziv;
        this.polumjer = polumjer;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPolumjer() {
        return polumjer;
    }

    public void setPolumjer(double polumjer) {
        this.polumjer = polumjer;
    }
}
