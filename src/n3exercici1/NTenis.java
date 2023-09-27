package n3exercici1;

import java.util.ArrayList;

/**
 *
 * @author OCuevas
 */
public class NTenis extends Noticia {
    
    private String competicio;
    private ArrayList<String> tenistes = new ArrayList<String>();
    
    public NTenis(String titular, String competicio, String tenista) {
        super(titular);
        this.competicio = competicio;
        
        tenistes.add(tenista);
        
    }
    
    public String getCompeticio() {
        return competicio;
    }
    
    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
    
    public ArrayList<String> getTenistas() {
        return tenistes;
    }
    
    public void setTenista(String tenista) {
        this.tenistes.add(tenista);
    }
    
    @Override
    public String toString() {
        return "Noticia de Tenis titular=" + super.getTitular() + ", text=" + super.getText() + ", puntuacio=" + super.getPuntuacio() + ", preu=" + super.getPreu() + ", Competicio=" + this.competicio + ", tenista=" + this.tenistes;
    }
    
    @Override
    public int calcularPreuNoticia() {
        int preu = 150;
        
        for (String t : tenistes) {
            
            if (t.equalsIgnoreCase("Federer") || (t.equalsIgnoreCase("Nadal")) || (t.equalsIgnoreCase("Djokovic"))) {
                preu += 100;
            }
        }
        super.setPreu(preu);
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio=4;
        for(String tenistes:this.tenistes){
            if(tenistes.equalsIgnoreCase("Federer")||tenistes.equalsIgnoreCase("Nadal") ||tenistes.equalsIgnoreCase("Djokovic")){
               puntuacio+=3; 
            }
        }
        super.setPuntuacio(puntuacio);
        return puntuacio;
    }
    
}
