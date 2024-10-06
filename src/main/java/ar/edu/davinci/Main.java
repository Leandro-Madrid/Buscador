package ar.edu.davinci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Juan Pérez");
        Articulo articulo1 = new Articulo("Título 1", Arrays.asList("Tema1", "Tema2"), autor1, "01/10/2024");
        PaginaWeb pagina1 = new PaginaWeb("http://pagina1.com", Arrays.asList("Tema1"), Arrays.asList(articulo1));

        Autor autor2 = new Autor("María López");
        Articulo articulo2 = new Articulo("Título 2", Arrays.asList("Tema2", "Tema3"), autor2, "02/10/2024");
        PaginaWeb pagina2 = new PaginaWeb("http://pagina2.com", Arrays.asList("Tema2"), Arrays.asList(articulo2));

        Autor autor3 = new Autor("Juan Pérez");
        Articulo articulo3 = new Articulo("Título 3", Arrays.asList("Tema1", "Tema4"), autor3, "03/10/2024");
        PaginaWeb pagina3 = new PaginaWeb("http://pagina3.com", Arrays.asList("Tema1", "Tema3"), Arrays.asList(articulo3));

        List<PaginaWeb> listaPaginas = new ArrayList<>(Arrays.asList(pagina1, pagina2, pagina3));


        Buscador buscador = new Buscador();


        buscador.setCriterio(new CriterioAutor());
        List<PaginaWeb> resultadosPorAutor = buscador.buscar(listaPaginas, "Juan");
        System.out.println("Resultados por autor 'Juan': " + resultadosPorAutor.size());


        buscador.setCriterio(new CriterioTema());
        List<PaginaWeb> resultadosPorTema = buscador.buscar(listaPaginas, "Tema2");
        System.out.println("Resultados por tema 'Tema2': " + resultadosPorTema.size());


        buscador.setCriterio(new CriterioUrl());
        List<PaginaWeb> resultadosPorUrl = buscador.buscar(listaPaginas, "pagina2");
        System.out.println("Resultados por URL 'pagina2': " + resultadosPorUrl.size());


        buscador.setCriterio(new CriterioFecha());
        List<PaginaWeb> resultadosPorFecha = buscador.buscar(listaPaginas, "02/10/2024");
        System.out.println("Resultados por fecha '02/10/2024': " + resultadosPorFecha.size());


        String[] rangoFechas = {"01/10/2024", "03/10/2024"};

        buscador.setCriterio(new CriterioRangoFechas());
        List<PaginaWeb> resultadosPorRangoFechas = buscador.buscar(listaPaginas, rangoFechas);
        System.out.println("Resultados entre fechas: " + resultadosPorRangoFechas.size());
    }
}
