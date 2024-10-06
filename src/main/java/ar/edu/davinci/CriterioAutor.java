package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioAutor implements CriterioBusqueda {
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object valor) {
        String criterio = (String) valor;
        return paginas.stream()
                .filter(pagina -> pagina.getArticulos().stream()
                        .anyMatch(articulo -> articulo.getAutor().getNombre().toLowerCase().contains(criterio.toLowerCase())))
                .collect(Collectors.toList());
    }
}
