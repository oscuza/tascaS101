package n3exercici1;

/**
 *
 * @author OCuevas
 */
public class NBasquet extends Noticia {
    
    private String competicio;
    private String club;
    
    public NBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }
    
    public String getCompeticio() {
        return competicio;
    }
    
    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
    
    public String getClub() {
        return club;
    }
    
    public void setClub(String club) {
        this.club = club;
    }
    
    @Override
    public String toString() {
        return "Noticia de Basquet{ titular=" + super.getTitular() + ", text=" + super.getText() + ", puntuacio=" + super.getPuntuacio() + ", preu=" + super.getPreu() + ", competicio=" + this.competicio + ", club=" + this.club ;
    }
    
    @Override
    public int calcularPreuNoticia() {
        int preu = 250;
        if (this.competicio.equalsIgnoreCase("Eurolliga")) {
            preu += 75;
        }
        if (this.club.equalsIgnoreCase("Barça") || (this.club.equalsIgnoreCase("Madrid"))) {
            preu += 75;
        }
        super.setPreu(preu);
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
  int puntuacio = 4;
        if (this.competicio.equals("Eurolliga")) {
            puntuacio += 3;
        }
        if (this.competicio.equals("ACB")) {
            puntuacio += 2;
        }
        if (this.club.equals("Barça") || club.equals("Madrid")) {
            puntuacio += 1;
        }
        super.setPuntuacio(puntuacio);
        return puntuacio;
    }
}
