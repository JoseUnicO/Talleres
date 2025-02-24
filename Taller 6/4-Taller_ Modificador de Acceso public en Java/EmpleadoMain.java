public class EmpleadoMain {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Jose", 3000000);
        System.out.println("Nombre: " + empleado1.nombre + ", Salario: " + empleado1.getSalario());

        Empleado empleado2 = new Empleado("Yisara", 3500000);
        System.out.println("Nombre: " + empleado2.nombre + ", Salario: " + empleado2.getSalario());
    
    }
}
