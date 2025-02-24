public class MatematicasMain {
    public static void main(String[] args) {
        int resultado;

        resultado = Matematicas.suma(5, 7);
        System.out.println("Resultado suma: " + resultado);

        resultado = Matematicas.resta(10, 3);
        System.out.println("Resultado resta: " + resultado);

        resultado = Matematicas.multiplicacion(4, 6);
        System.out.println("Resultado multiplicacion: " + resultado);

        double resultadoDivision = Matematicas.division(8, 2);
        System.out.println("Resultado division: " + resultadoDivision);

        resultadoDivision = Matematicas.division(8, 0);
        System.out.println("Resultado division por cero: " + resultadoDivision);
    }
}