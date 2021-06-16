package src;

public class Libro {

    private int id;
    private String nombre;
    private int salida;
    private boolean bandera;

    public Libro() {

    }

    public Libro(int id, String nombre, int salida, boolean bandera) {
        this.id = id;
        this.nombre = nombre;
        this.salida = salida;
        this.bandera = bandera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public boolean getBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public void prestarLibro() {
        setBandera(false);
    }

    public void devolverLibro() {
        setBandera(true);
    }

    public void mostrarInfo() {
        System.out.println("Id: " + id + " Nombre del libro: " + nombre + " Año de salida: " + salida + " Disponibilidad: " + bandera);
    }
}
