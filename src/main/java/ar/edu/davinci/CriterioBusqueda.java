package ar.edu.davinci;

import java.util.List;

public interface CriterioBusqueda<T> {
    List<PaginaWeb> buscar(List<PaginaWeb> paginas, T criterio);
}
