public class CocheMain{
  public static void main(String[] args) {
    
    Coche coche = new Coche("Toyota", "Hilux");
    
    Coche.incrementarContador();

    Coche coche2 = new Coche("Mazda", "CX-5");
    
    Coche.incrementarContador();

    coche.mostrarDetalles();
    coche2.mostrarDetalles();
    
    Coche.mostrarContadorCoches();
  }
}
