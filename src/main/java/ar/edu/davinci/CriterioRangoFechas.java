package ar.edu.davinci;

import java.util.List;
import java.util.stream.Collectors;


public class CriterioRangoFechas implements CriterioBusqueda<String[]> {

    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, String[] rangoFechas) {
        return paginas.stream()
                .filter(pagina -> pagina.getArticulos().stream()
                        .anyMatch(articulo -> {
                            String fechaPublicacion = articulo.getFechaPublicacion();
                            return fechaPublicacion.compareTo(rangoFechas[0]) >= 0 &&
                                    fechaPublicacion.compareTo(rangoFechas[1]) <= 0;
                        }))
                .collect(Collectors.toList());
    }
}
