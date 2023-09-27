
package n2exercici1;

/**
 *
 * @author OCuevas
 */
public class Main {

    /*
    Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar(). 
    Aquest mètode ha de rebre un String amb un número de telèfon. 
    El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre. 
    Crea una interfície anomenada "Camera" amb el mètode fotografiar(), i una altra interfície anomenada Rellotge amb el mètode alarma().
    Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" i que a la vegada implementi les interfícies "Camera" i "Rellotge".
    El mètode fotografiar() ha de mostrar per consola: “S’està fent una foto” i el mètode alarma() ha de mostrar: “Està sonant l’alarma”.
    Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.
     */
    public static void main(String[] args) {
       
        
        Smartphone smp1= new Smartphone("Samsung","Note 10");
        
        smp1.trucar("93 123 123");
        smp1.fotografiar();
        smp1.alarma();
    
        
    }
    
}
