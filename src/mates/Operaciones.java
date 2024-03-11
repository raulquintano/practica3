package mates;
import java.util.stream.DoubleStream;

public class Operaciones {

    public static double aproximacionPi(long pasos) {
        double puntos = DoubleStream.generate(() -> Math.random() * 2 - 1)
        .limit(pasos)
        .filter(x -> Math.pow(x, 2) + Math.pow(Math.random() * 2 - 1, 2) <= 1)
        .count();
        return 4.0 * puntos / pasos;
    }
}