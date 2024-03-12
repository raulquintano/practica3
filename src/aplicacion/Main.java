package aplicacion;

// Importamos la clase Operaciones del paquete mates
import mates.Operaciones;

// Clase Main
public class Main {

    // Metodo main
    public static void main(String[] args) {
        // Imprimimos el resultado de la aproximacion al numero pi
        System.out.println("La aproximacion al numero pi es: " + Operaciones.aproximacionPi(Integer.parseInt("100000000")));
    }
}