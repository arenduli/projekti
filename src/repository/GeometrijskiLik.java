package repository;

// bazna klasa koja sadrzi elemente koji su zajednicki u nekim drugim klasama
public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;
    public abstract double povrsina();
    public abstract double opseg();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String toString() {
        return "Naziv: " + this.naziv + "\n" +
               "Površina: " + povrsina() + "\n" +
               "Opseg: " + opseg() + "\n";
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public int compareTo(GeometrijskiLik drugi) {    // compareTo metoda koja uspoređuje i sortira 2 geometrijska lika
        return Double.valueOf(this.povrsina()).compareTo(Double.valueOf(drugi.povrsina()));
    }
}
