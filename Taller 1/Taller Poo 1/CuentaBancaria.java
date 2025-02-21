public class CuentaBancaria {

   String NumeroCuenta;
   double saldo;
   String TipoCuenta;   
    
    //CONSTRUCTOR
    public CuentaBancaria(){
        
        NumeroCuenta = "32145"; 
        saldo = 1000000;
        TipoCuenta = "Ahorros";
       
    }
    //CONSTRUCTOR PARAMETRIZADO
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta){
        
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
        
    }
    //CONSTRUCTOR SOBRECARGADO
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.NumeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.TipoCuenta = tipoCuenta;
    }

    public String toString() {
        return "CuentaBancaria{" +
                "NumeroCuenta='" + NumeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", TipoCuenta='" + TipoCuenta + '\'' +
                '}';
    }
}
