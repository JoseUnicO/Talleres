public class Error {

    private String error;

    //ublic static void mostrarNombre() {
        //System.out.println(this.error); // Error de compilación: No se puede usar `this` en un contexto estáticov
    //}

    //Corregido
    public Error(String error) {
        this.error = error;
    }

    public void mostrarNombre() { // Eliminar 'static' para que pueda usar 'this'
        System.out.println(this.error);
    }
}
