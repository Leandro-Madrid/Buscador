package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioTema implements CriterioBusqueda {
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        if (!(criterio instanceof String)) {
            throw new IllegalArgumentException("El criterio debe ser de tipo String");
        }

        String temaBuscado = (String) criterio;
        return paginas.stream()
                .filter(pagina -> pagina.getTemas().stream()
                        .anyMatch(tema -> tema.toLowerCase().contains(temaBuscado.toLowerCase())))
                .collect(Collectors.toList());
    }
}
