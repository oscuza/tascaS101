package n3exercici1;

/**
 *
 * @author OCuevas
 */
public class NFutbol extends Noticia {

    private String competicio;
    private String club;
    private String jugador;

    public NFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Noticia de futbol{ titular=" + super.getTitular() + ", text=" + super.getText() + ", puntuacio=" + super.getPuntuacio() + ", preu=" + super.getPreu() + ", competicio=" + this.competicio + ", club=" + this.club + ", jugador=" + this.jugador ;
    }

    @Override
    public int calcularPreuNoticia() {
       int preu=300;

        if (this.competicio.equalsIgnoreCase("LLiga de Campions")) {
            preu += 100;
        }
        if (this.club.equalsIgnoreCase("Barça") || (this.club.equalsIgnoreCase("Madrid"))) {
            preu += 100;
        }
        if (this.jugador.equalsIgnoreCase("Ferran Torres") || (this.jugador.equalsIgnoreCase("Benzema"))) {
            preu += 50;
        }
        super.setPreu(preu);
        return preu;

    }

    @Override
    public int calcularPuntuacio() {
         int puntuacio = 5;
        if (this.competicio.equals("Lliga de Campions")) {
            puntuacio += 3;
        }
        if (this.competicio.equals("Lliga")) {
            puntuacio += 2;
        }
        if (this.club.equals("Barça") || club.equals("Madrid")) {
            puntuacio += 1;
        }
        if (this.jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            puntuacio += 1;
        }
        super.setPuntuacio(puntuacio);
        return puntuacio;
    }

}
