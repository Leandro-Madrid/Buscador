package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioUrl implements CriterioBusqueda<String> {

    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, String urlBuscada) {
        return paginas.stream()
                .filter(pagina -> pagina.getUrl().toLowerCase().contains(urlBuscada.toLowerCase()))
                .collect(Collectors.toList());
    }
}