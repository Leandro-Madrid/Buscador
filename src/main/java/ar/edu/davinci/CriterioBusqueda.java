package ar.edu.davinci;

import java.util.List;

public interface CriterioBusqueda {
    List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio);
}
