package n1exercici2;

/**
 *
 * @author OCuevas
 */
public class Main {

    public static void main(String[] args) {
        Cotxe c1 = new Cotxe("Panda", 110);
        Cotxe c2= new Cotxe("Ibiza",110);

        c1.accelerar();//metode no static. metode d'instancia
        Cotxe.frenar();//metode static.  metode de classe
        System.out.println(c1.toString());
        c1.setModel("Malaga");
        System.out.println(c1.toString());
        
        
        
        c2.accelerar();
        Cotxe.frenar();
        System.out.println(c2.toString());
        c2.setModel("Exeo");
        System.out.println(c2.toString());
        
        
    }
}
