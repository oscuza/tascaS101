package n1exercici1;

/**
 *
 * @author OCuevas
 */
public class Main {

    public static void main(String[] args) {
        Instrument corda1 = new Corda("Guitarra", 105.25);
        Instrument vent1 = new Vent("Flauta", 10.50);
        Instrument percussio1 = new Percussio("Tambor", 55.62);
        
        System.out.println(corda1.toString()+" "+corda1.tocar());
        System.out.println(vent1.toString()+" "+vent1.tocar());
        System.out.println(percussio1.toString()+" "+percussio1.tocar());
        
              
    }

}
