package n3exercici1;

/**
 *
 * @author OCuevas
 */
public class NMotociclisme extends Noticia {

    private String equip;

    public NMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    @Override
    public String toString() {
        return "Noticia de Moticlisme{ titular=" + super.getTitular() + ", text=" + super.getText() + ", puntuacio=" + super.getPuntuacio() + ", preu=" + super.getPreu() + ", Equip=" + this.equip;
    }

    @Override
    public int calcularPreuNoticia() {
        int precio = 100;
        if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            precio += 50;
        }
        super.setPreu(precio);
        return precio;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 3;

        if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            puntuacio += 3;
        }
        super.setPuntuacio(puntuacio);
        return puntuacio;
    }
}
