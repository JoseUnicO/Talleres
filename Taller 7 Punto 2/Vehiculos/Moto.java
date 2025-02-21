package Vehiculos;

public class Moto  extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfoMoto() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}
