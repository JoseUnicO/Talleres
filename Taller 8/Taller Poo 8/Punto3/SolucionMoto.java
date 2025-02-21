package Punto3;

public class SolucionMoto {
    private String modelo;

    public SolucionMoto(String modelo) {
        this.modelo = modelo;
    }

    public static void mostrarModelo(SolucionMoto moto) {
        System.out.println("Modelo: " + moto.modelo);
    }
}
