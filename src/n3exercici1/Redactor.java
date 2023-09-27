
package n3exercici1;

import java.util.ArrayList;

/**
 *
 * @author OCuevas
 */
public class Redactor {
    private String nom;
    private  final String DNI;
    private static double sou;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        Redactor.sou = 1500;
        this.noticies=new ArrayList<Noticia>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        Redactor.sou = sou;
    }

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticia(Noticia noticia) {
       this.noticies.add(noticia);
    }

    
    @Override
    public String toString() {
        return "Redactor{" + "nom=" + this.nom + ", DNI=" + this.DNI + ", sou=" + this.sou +", Noticies: "+this.noticies +"\n";
    }
    
    
}
