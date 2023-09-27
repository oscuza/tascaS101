package n1exercici2;

/**
 *
 * @author OCuevas
 */
public class Cotxe {

    /*
    Crea una classe "Cotxe" amb els atributs: marca, model i potència. 
    La marca ha de ser estàtic final,el model estàtic i la potència final. 
    Demostra la diferència entre els tres. 
    N’hi ha algun que es pugui inicialitzar al constructor de la classe?
    Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() 
    i un altre no estàtic anomenat accelerar().
    El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” 
    i el mètode frenar() ha de mostrar: “El vehicle està frenant”. 
    Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.
     */
    private static final String MARCA = "Seat";
    private static String model;
    private final int POTENCIA;

    public Cotxe(String model, int potencia) {
        //Els atribut model y POTENCIA es pode crear desde el constructor
        Cotxe.model = model;
        this.POTENCIA = potencia;
    }

    public String getMarca() {
        return MARCA;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPotencia() {
        return POTENCIA;
    }

    @Override
    public String toString() {
        return "Cotxe{" + "marca=" + Cotxe.MARCA + ", model=" + Cotxe.model + ", potencia=" + this.POTENCIA + '}';
    }

    /*
    Metode static. Es un metode de clase. 
    Afecta a totes les instancies de la Clase cotxe.
     */
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    /*
    Metode NO static. es un metode d'instancia
     */
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}
