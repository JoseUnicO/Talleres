public class CocheMain {
    public static void main(String[] args) {
        
        Coche coche = new Coche();

        // Como las propiedades son privadas da error al compilar
         coche.marca = "Mazda";  // Error de compilacion
         coche.modelo = "Mazda 3 G25"; // Error de compilacion
         coche.velocidadMaxima = 210; // Error de compilacion

        // Se deben usar los métodos setter para asignar valores
        coche.setMarca("Mazda");
        coche.setModelo("Mazda 3 G25");
        coche.setVelocidadMaxima(210);

        
        coche.acelerar(15);

        
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad máxima actual: " + coche.getVelocidadMaxima());
    }
    }

