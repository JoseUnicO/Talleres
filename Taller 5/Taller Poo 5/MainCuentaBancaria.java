public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        // No se puede acceder al saldo porque no estan los get/set
         System.out.println(cuenta.saldo); 
    }
}
