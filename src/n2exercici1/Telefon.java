
package n2exercici1;

/**
 *
 * @author OCuevas
 */
public class Telefon {
   private String marca;
   private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Telefon{" + "marca=" + marca + ", model=" + model + '}';
    }
   
   
   
   
   
   //mètode 
   public void trucar(String tfn){
       System.out.println( "S’està trucant al número "+tfn);
   }
}
