package src;

public class Fraccion {

    private int primerNumerador;
    private int primerDenominador;
    private int segundoNumerador;
    private int segundoDenominador;

    public Fraccion(int primerNumerador, int primerDenominador, int segundoNumerador, int segundoDenominador) {
        this.primerNumerador = primerNumerador;
        this.primerDenominador = primerDenominador;
        this.segundoNumerador = segundoNumerador;
        this.segundoDenominador = segundoDenominador;
    }

    public int getPrimerNumerador() {
        return primerNumerador;
    }

    public void setPrimerNumerador(int primerNumerador) {
        this.primerNumerador = primerNumerador;
    }

    public int getPrimerDenominador() {
        return primerDenominador;
    }

    public void setPrimerDenominador(int primerDenominador) {
        this.primerDenominador = primerDenominador;
    }

    public int getSegundoNumerador() {
        return segundoNumerador;
    }

    public void setSegundoNumerador(int segundoNumerador) {
        this.segundoNumerador = segundoNumerador;
    }

    public int getSegundoDenominador() {
        return segundoDenominador;
    }

    public void setSegundoDenominador(int segundoDenominador) {
        this.segundoDenominador = segundoDenominador;
    }

    public String sumarFracciones() {
        int numerador = (primerNumerador * segundoDenominador) + (segundoNumerador * primerDenominador);
        int denominador = (primerDenominador * segundoDenominador);
        return numerador + "/" + denominador;
    }

    public String restarFracciones() {
        int numerador = (primerNumerador * segundoDenominador) - (segundoNumerador * primerDenominador);
        int denominador = (primerDenominador * segundoDenominador);
        return numerador + "/" + denominador;
    }

    public String multiplicarFracciones() {
        int numerador = (primerNumerador * segundoNumerador);
        int denominador = (primerDenominador * segundoDenominador);
        return numerador + "/" + denominador;
    }

    public String dividirFracciones() {
        int numerador = (primerNumerador * segundoDenominador);
        int denominador = (primerDenominador * segundoNumerador);
        return numerador + "/" + denominador;
    }
    public String mostrarFracciones(){
        return primerNumerador+"/"+primerDenominador+" "+segundoNumerador+"/"+segundoDenominador;
    }
}
