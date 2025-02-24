public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("53421", 1500000, "Ahorros");

        // Genera error al compilar porque intenta acceder directamente a numeroCuenta
         System.out.println(cuenta.numeroCuenta); // Descomentar para ver el error
        
    }
}
