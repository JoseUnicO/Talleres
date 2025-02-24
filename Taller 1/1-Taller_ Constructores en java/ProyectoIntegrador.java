import java.util.Scanner;

public class ProyectoIntegrador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        
        System.out.println("\nIngrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el curso del estudiante:");
        String curso = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println("\nIngrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas:");
        int paginas = scanner.nextInt();

        Libro libro = new Libro(titulo, autor, paginas);

        System.out.println("\nDetalles de la Cuenta Bancaria:");
        System.out.println(cuenta);

        System.out.println("\nDetalles del Estudiante:");
        System.out.println(estudiante);

        System.out.println("\nDetalles del Libro:");
        libro.detallesDelLibro(); 

        scanner.close();   
    }
}
