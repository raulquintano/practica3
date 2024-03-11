package aplicacion;

import mates.Operaciones;

public class Main {

    public static void main(String[] args) {

        System.out.println("La aproximacion al numero pi es: " + Operaciones.aproximacionPi(Integer.parseInt("100000000")));
    }
}