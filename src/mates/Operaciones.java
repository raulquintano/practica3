package mates;

// Importamos la clase Random del paquete java.util
import java.util.Random;
import java.util.stream.IntStream;

// Clase Operaciones
public class Operaciones {

    // Creamos un objeto Random
    static Random random = new Random();

    // Metodo para calcular la aproximacion al numero pi
    public static double aproximacionPi(long pasos) {
        // Calculamos los puntos que caen dentro del circulo
        long puntos = IntStream.rangeClosed(0, (int) pasos)
        // Filtramos los puntos que caen dentro del circulo
        .filter(i -> Math.pow(random.nextDouble(), 2) + Math.pow(random.nextDouble(), 2) <= 1)
        // Contamos los puntos que caen dentro del circulo
        .count();
        // Retornamos la aproximacion al numero pi
        return 4.0 * puntos / pasos;
    }
}
