package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;


public class CriterioAutor implements CriterioBusqueda<String> {

    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, String criterio) {
        return paginas.stream()
                .filter(pagina -> pagina.getArticulos().stream()
                        .anyMatch(articulo -> articulo.getAutor().getNombre().toLowerCase().contains(criterio.toLowerCase())))
                .collect(Collectors.toList());
    }
}