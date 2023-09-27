
package n1exercici1;

/**
 *
 * @author formacio
 */
public class Percussio extends Instrument{

    public Percussio(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public String  tocar() {
        return"Està sonant un instrument de percussió";
    }
    
}
