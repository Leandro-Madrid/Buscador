package ar.edu.davinci;

import java.util.List;

public class Buscador {
    private CriterioBusqueda criterio;

    public void setCriterio(CriterioBusqueda criterio) {
        this.criterio = criterio;
    }

    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        return this.criterio.buscar(paginas, criterio);
    }
}
