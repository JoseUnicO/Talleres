package Prueba;

import Vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", 600);
        moto.mostrarInfoMoto();

        //Genera un error de compilacion porque intenta agarrar atributos de una clase distinta
        System.out.println("Accediendo directamente: Tipo = " + moto.tipo + ", Marca = " + moto.marca);
    }
}
