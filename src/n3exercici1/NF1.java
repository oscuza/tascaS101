package n3exercici1;

/**
 *
 * @author OCuevas
 */
public class NF1 extends Noticia {

    private String escuderia;

    public NF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "Noticia de Basquet{ titular=" + super.getTitular() + ", text=" + super.getText() + ", puntuacio=" + super.getPuntuacio() + ", preu=" + super.getPreu() + ", Escuderia=" + this.escuderia;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 100;

        if (this.escuderia.equalsIgnoreCase("Ferrari") || (this.escuderia.equalsIgnoreCase("Mercedes"))) {
            preu += 50;
        }
        super.setPreu(preu);
        return preu;

    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4;

        if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
            puntuacio += 2;
        }
        super.setPuntuacio(puntuacio);
        return puntuacio;
    }

}
