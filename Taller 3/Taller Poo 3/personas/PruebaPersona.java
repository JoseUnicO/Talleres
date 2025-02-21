package personas;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Carlos", 30);

        //sale el error de que no es visible pues es privado
        //System.out.println(persona.nombre);

        System.out.println("Edad: " + persona.edad); 

        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Ana");

        System.out.println("Nuevo Nombre: " + persona.getNombre()); 
        persona.mostrarInfo(); 
    }
}
