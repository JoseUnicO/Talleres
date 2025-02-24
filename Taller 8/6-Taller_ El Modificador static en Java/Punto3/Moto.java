package Punto3;
public class Moto {
    private String marca; //Marca no es estatica por eso da el error al tratar de compilar.

    public static void mostrarMarca() {
        System.out.println("Marca: " + marca); //mostrarMarca es static por eso no puede acceder al atributo. 
    }
}