
package n1exercici1;

/**
 *
 * @author OCuevas
 */
public abstract class Instrument {
    
    private String nom;
    private double preu;

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Instrument{" + "nom=" + nom + ", preu=" + preu + '}';
    }
  
   
    public abstract String tocar();
}
