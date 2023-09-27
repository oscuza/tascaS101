package n1exercici1;

/**
 *
 * @author OCuevas
 */
public class Corda extends Instrument{

    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public String tocar() {
          return"Està sonant un instrument de corda";
    }
    
}
