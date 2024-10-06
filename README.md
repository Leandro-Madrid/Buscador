# Buscador

Se desea modelar cómo funciona un buscador de páginas web. Para esto, contamos con una clase `PaginaWeb`:

```java
class PaginaWeb {
    public PaginaWeb(String url, List<String> temas, List<Articulo> articulos) {
        ...
    }
}

class Articulo {
    public Articulo(String titulo, List<String> temas, Autor autor, Date fechaPublicacion) {
        ...
    }
}
```

Se desea implementar un buscador, el cual busca por los siguientes criterios:

- Por Autor (nombre parcial o completo)
- Por Fecha de Publicación (dado una fecha concreta)
- Entre fechas (dado una fecha de inicio y fin)
- Por temas (parcial o total)
- Por URL (parcial o total)

Cada criterio devuelve una lista de páginas web. Su solución debe ser "case insensitive".

Claro, aquí tienes un README simplificado y sin código:

---

## Clases

- **PaginaWeb**: Representa una página web, que contiene su URL, temas y artículos.
- **Articulo**: Representa un artículo, incluyendo su título, temas, autor y fecha de publicación.
- **Autor**: Representa al autor de un artículo.
- **Buscador**: Implementa la lógica de búsqueda por autor, fecha, temas y URL, utilizando Java Streams para realizar filtraciones de manera eficiente.
- **CriterioBusqueda**: Interfaz que define el método de búsqueda.
- **CriterioAutor**: Implementa la lógica para buscar páginas web basadas en el nombre del autor.
- **CriterioFecha**: Busca páginas web que contengan artículos publicados en una fecha concreta.
- **CriterioRangoFechas**: Busca páginas web con artículos publicados entre dos fechas.
- **CriterioTema**: Busca páginas web que contengan artículos relacionados con un tema específico.
- **CriterioUrl**: Busca páginas web que contengan una parte específica en su URL.

## Explicación de Uso de Patrones

- **Strategy**: Este patrón permite encapsular diferentes criterios de búsqueda, permitiendo que cada uno tenga su propia lógica sin afectar a los demás.
