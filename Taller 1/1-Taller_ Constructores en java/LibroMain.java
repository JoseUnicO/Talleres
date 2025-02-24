public class LibroMain {
    public static void main(String[] args) {

        //Libro constructor por defecto
        Libro libro1 = new Libro();
        
        //Libro constructor parametrizado
        Libro libro2 = new Libro("El lado oscuro de la tierra", "Joselito Carnaval", 1000);

        //Mostrar detalles de los libros
        System.out.println("Detalles del libro 1:");
        libro1.detallesDelLibro();

        System.out.println("\nDetalles del libro 2:");
        libro2.detallesDelLibro();
    }
}
