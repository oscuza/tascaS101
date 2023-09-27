
package n3exercici1;

/**
 *
 * @author OCuevas
 */
public abstract  class Noticia {
    private String titular;
    private String text;
    private int puntuacio;
    private int preu;

    public Noticia(String titular) {
        this.titular = titular;
        this.text = " ";
        this.puntuacio = 0;
        this.preu = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

   
  

  public abstract int calcularPreuNoticia();
   public abstract int calcularPuntuacio();
    
    
    
}
