package ar.edu.davinci;

import java.util.List;

public class Articulo {
    private String titulo;
    private List<String> temas;
    private Autor autor;
    private String fechaPublicacion; // Cambiado a String

    public Articulo(String titulo, List<String> temas, Autor autor, String fechaPublicacion) {
        this.titulo = titulo;
        this.temas = temas;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion; // Asignación de String
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getTemas() {
        return temas;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion; // Devuelve el String
    }
}
