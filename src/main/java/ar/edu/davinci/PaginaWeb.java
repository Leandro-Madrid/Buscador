package ar.edu.davinci;

import java.util.List;

public class PaginaWeb {
    private String url;
    private List<String> temas;
    private List<Articulo> articulos;

    public PaginaWeb(String url, List<String> temas, List<Articulo> articulos) {
        this.url = url;
        this.temas = temas;
        this.articulos = articulos;
    }

    public String getUrl() {
        return url;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public List<String> getTemas() {
        return temas;
    }
}

