package repository;

// bazna klasa koja sadrzi elemente koji su zajednicki u nekim drugim klasama
public abstract class GeometrijskiLik {

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
}
