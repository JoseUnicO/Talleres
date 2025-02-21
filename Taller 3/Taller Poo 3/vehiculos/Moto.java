package vehiculos;

class Moto extends Vehiculo {
    Moto(String tipo) {
        super(tipo);
    }

    void mostrarInfoMoto() {
        System.out.println("Esta es una moto del tipo: " + tipo);
    }
}
