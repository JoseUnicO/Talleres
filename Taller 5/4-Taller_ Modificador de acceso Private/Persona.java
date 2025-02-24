//Uso incorrecto del private

public class Persona {
    private String nombre;
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //El atributo privado genera un error de compilacion al intentar acceder directamente
         persona.nombre = "Juan"; 
        System.out.println(Persona.nombre); // ERROR: nombre tiene acceso privado en Persona
    }
}
