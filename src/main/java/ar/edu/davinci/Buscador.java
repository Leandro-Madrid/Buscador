package ar.edu.davinci;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Buscador {

    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Predicate<PaginaWeb> criterio) {
        return paginas.stream()
                .filter(criterio)
                .collect(Collectors.toList());
    }
}