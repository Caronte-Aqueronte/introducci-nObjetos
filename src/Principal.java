package src;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    public Principal() {
        System.out.println("Ejercutando la clase Contador");
        Contador contador = new Contador(0);
        Contador contador2 = contador;
        System.out.println(contador.getContador());
        contador2.incrementarContador();
        System.out.println(contador.getContador());
        contador2.decrementarontador();
        System.out.println(contador.getContador());

        System.out.println("Ejecutando la clase Cuadrado");
        Cuadrado cuadrado = new Cuadrado(5);
        Cuadrado cuadrado2 = cuadrado;
        cuadrado2.setLado(6);
        System.out.println("El lado es " + cuadrado.getLado());
        System.out.println("El area es " + cuadrado.calcularArea());
        System.out.println("El perimetro es " + cuadrado.calcularPerimetro());

        System.out.println("Ejecutando la clase Circulo");
        Circulo circulo = new Circulo(4);
        Circulo circulo2 = circulo;
        circulo2.setRadio(6);
        System.out.println("El radio es " + circulo.getRadio());
        System.out.println("El area es " + circulo.calcularArea());
        System.out.println("El perimetro es " + circulo.calcularPerimetro());

        System.out.println("Ejecutando la clase Rectangulo");
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Rectangulo rectangulo2 = rectangulo;
        rectangulo2.setAncho(7);
        rectangulo2.setLargo(2);
        System.out.println("El area es " + rectangulo.calcularArea());
        System.out.println("El perimetro es " + rectangulo.calcularPerimetro());

        System.out.println("Ejecutando clase Libro");
        Libro libro = new Libro(1, "It", 2019, true);
        Libro libro2 = libro;
        libro.mostrarInfo();
        libro2.setNombre("ANABELLE");
        libro.mostrarInfo();
        libro2.prestarLibro();
        libro.mostrarInfo();
        libro2.devolverLibro();
        libro.mostrarInfo();

        System.out.println("Ejecutando clase Fraccion");
        Fraccion fraccion = new Fraccion(5, 2, 3, 5);
        System.out.println(fraccion.mostrarFracciones());
        Fraccion fraccion2 = fraccion;
        fraccion2.setPrimerNumerador(1);
        fraccion2.setSegundoNumerador(1);
        System.out.println(fraccion.mostrarFracciones());
        System.out.println("La suma es " + fraccion.sumarFracciones());
        System.out.println("La resta es " + fraccion.restarFracciones());
        System.out.println("La multiplicacion es " + fraccion.multiplicarFracciones());
        System.out.println("La division es " + fraccion.dividirFracciones());

    }
}
