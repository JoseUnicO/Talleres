public class Libro {

    String titulo;
    String autor;
    int numeroDePaginas;

    //CONSTRUCTOR
    public Libro(){

        titulo = "Las Aventuras de Himman";
        autor= "Joselito Carnaval";
        numeroDePaginas = 50;
        
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Libro(String titulo, String autor, int numeroDePaginas){
        
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;

    }

    public void detallesDelLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor:  " +  autor);
        System.out.println("Número de Paginas: " + numeroDePaginas);
    }

    public String toString(){
        return "Libro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", numeroDePaginas=" + numeroDePaginas +
        '}'; 
    }
}
