public class Moto extends Vehiculo{
    public void acelerar(int velocidad) {  // al no haber un override no avisa de que se esta sobrescribiendo
        System.out.println("La moto acelera a " + velocidad + " km/h.");
    }
}
