import model.Krug;
import model.Pravokutnik;
import repository.GeometrijskiLik;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Krug k1 = new Krug("krug1", 10.0);
        Krug k2 = new Krug("krug2", 5.0);

        Pravokutnik p1 = new Pravokutnik("pravokutnik1", 4.0, 5.0);
        Pravokutnik p2 = new Pravokutnik("pravokutnik2", 3.0, 3.0);

        Ucilica ucilica = new Ucilica();
        ucilica.getLikovi().add(k1);
        ucilica.getLikovi().add(k2);
        ucilica.getLikovi().add(p1);
        ucilica.getLikovi().add(p2);

        Collections.sort(ucilica.getLikovi());

        for (GeometrijskiLik lik : ucilica.getLikovi()) {
            System.out.println(lik.toString());
        }

    }
}
