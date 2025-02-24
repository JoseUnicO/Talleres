public class Banco {
    protected double saldo;

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo actual: € " + saldo);
    }
}

//Le estamos dando un mal uso de los modificadores de acceso pues si otra clase herda "Banco".
//puede usarla sin problemas.
//En este caso lo correcto seria usar private darle metodos como get y propiedad como depositar o retirar.
//Y proporsionar un mejor encapsulamiento.

