package src;

public class Rectangulo {

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        if (ancho == largo) {
            largo++;
        }
        this.ancho = ancho;
        this.largo = largo;
    }

    public double calcularArea() {
        return ancho * largo;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + largo);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

}
