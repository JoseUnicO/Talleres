public class Coche {
    
    public static int contadorCoches = 0;
    public String marca;
    public String modelo;
    
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void incrementarContador() {
        contadorCoches++;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }
    
}
