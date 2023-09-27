
package n1exercici1;

/**
 *
 * @author OCuevas
 */
public class Vent extends Instrument {

    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    
    @Override
    public String tocar() {
          return "Està sonant un instrument de vent";
    }
    
}
