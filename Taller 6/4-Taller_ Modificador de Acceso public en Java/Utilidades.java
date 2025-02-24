public class Utilidades {

    public double suma;
    public double resta;
    public double multiplicacion;
    public double division;

    public Utilidades(double a, double b){
        this.suma = a + b;
        this.resta = a - b;
        this.multiplicacion = a * b;
        this.division = (b != 0) ? (a / b): Double.NaN;
    }

    public void MostrarResultados(){
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division; " + (Double.isNaN(division) ? "No se puede dividir por 0": division));


    }
}
