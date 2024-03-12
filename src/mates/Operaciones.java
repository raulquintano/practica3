package mates;
// Importamos la clase DoubleStream del paquete java.util.stream
import java.util.stream.DoubleStream;

// Clase Operaciones
public class Operaciones {

    // Metodo para calcular la aproximacion al numero pi
    public static double aproximacionPi(long pasos) {
        // Calculamos la cantidad de puntos que caen dentro del circulo
        double puntos = DoubleStream.generate(() -> Math.random() * 2 - 1)
        // Limitamos la cantidad de puntos a la cantidad de pasos
        .limit(pasos)
        // Filtramos los puntos que caen dentro del circulo
        .filter(x -> Math.pow(x, 2) + Math.pow(Math.random() * 2 - 1, 2) <= 1)
        // Contamos la cantidad de puntos que quedaron
        .count();
        // Retornamos la aproximacion al numero pi
        return 4.0 * puntos / pasos;
    }
}