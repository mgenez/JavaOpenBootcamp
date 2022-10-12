package com.company;

public class EjercicioClaseCoche {

    public static void main(String[] args) {
    Coche miCoche  = new Coche();

    int cantidadDePuertas = miCoche.sumarPuerta(1);
        System.out.println("La cantidad de puertas es " + cantidadDePuertas);

    }
}
class Coche {
    int puertas = 0;

    public int sumarPuerta(int puertas){
       return puertas++;
    }


}


