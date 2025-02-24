public class Estudiante {
    
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(){
        this("Jose Muñoz", 20);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre" + this.nombre + ", edad: " + this.edad);
    }
}
