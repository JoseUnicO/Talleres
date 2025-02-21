public class Estudiante {
    
    String nombre;
    int edad;
    String curso;

    //CONSTRUCTOR
    public Estudiante(){
        nombre = "";
        edad = 0;
        curso = "";

    }

    //CONSTRUCTOR PARAMETRIZADO
    public Estudiante(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }
    
    //CONSTRUCTOR CON THIS
    public Estudiante(String nombre, int edad, String curso){

        this(nombre, edad);
        this.curso = curso;
    }

    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
