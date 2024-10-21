package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;


public class CriterioTema implements CriterioBusqueda<String> {

    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, String temaBuscado) {
        return paginas.stream()
                .filter(pagina -> pagina.getTemas().stream()
                        .anyMatch(tema -> tema.toLowerCase().contains(temaBuscado.toLowerCase())))
                .collect(Collectors.toList());
    }
}