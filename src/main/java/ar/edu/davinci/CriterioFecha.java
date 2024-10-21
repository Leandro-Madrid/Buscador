package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;


public class CriterioFecha implements CriterioBusqueda<String> {

    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, String fechaBuscada) {
        return paginas.stream()
                .filter(pagina -> pagina.getArticulos().stream()
                        .anyMatch(articulo -> articulo.getFechaPublicacion().equals(fechaBuscada)))
                .collect(Collectors.toList());
    }
}