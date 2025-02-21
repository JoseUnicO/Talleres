public class EstudianteMain {
    
    public static void main(String[] args) {
        
        Estudiante estudiante =  new Estudiante("Jose Muñoz", 20, 4.8);
        
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Promedio.: " + estudiante.getNotaPromedio());
    }
}
