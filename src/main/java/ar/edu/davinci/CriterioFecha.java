package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioFecha implements CriterioBusqueda {
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object valor) {
        if (!(valor instanceof String)) {
            throw new IllegalArgumentException("El valor debe ser de tipo String");
        }

        String fechaBuscada = (String) valor;
        return paginas.stream()
                .filter(pagina -> pagina.getArticulos().stream()
                        .anyMatch(articulo -> articulo.getFechaPublicacion().equals(fechaBuscada)))
                .collect(Collectors.toList());
    }
}
