package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioUrl implements CriterioBusqueda {
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        if (!(criterio instanceof String)) {
            throw new IllegalArgumentException("El criterio debe ser de tipo String");
        }

        String urlBuscada = (String) criterio;
        return paginas.stream()
                .filter(pagina -> pagina.getUrl().toLowerCase().contains(urlBuscada.toLowerCase()))
                .collect(Collectors.toList());
    }
}
