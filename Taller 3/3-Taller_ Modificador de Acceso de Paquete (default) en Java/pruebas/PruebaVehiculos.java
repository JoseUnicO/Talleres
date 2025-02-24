package pruebas;

import vehiculos.Moto; 
import vehiculos.Vehiculo; 

public class PruebaVehiculos {
    public static void main(String[] args) {
        
        Moto moto = new Moto("Deportiva");

        System.out.println(moto.tipo); 
        moto.mostrarTipo();
        moto.mostrarInfoMoto(); 
    }
}