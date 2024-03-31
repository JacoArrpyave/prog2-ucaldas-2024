// titulo (String): Título del libro.
// autor (Autor): Autor del libro.
// isbn (String): ISBN del libro.
// categoria (String): Categoría del libro.
// ejemplares (int): Número de ejemplares disponibles del libro

public class Libro {
    private String titulo;
    private String isbn;
    private int ejemplares;
    private Autor autor;
    private String categoria;

    public Libro() {
    }

    public Libro(String titulo, String isbn, int ejemplares, Autor autor, String categoria) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean hayEjemplares() {
        return ejemplares > 0;

    }

    public String getCategoria() {
        return categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "LIBRO:\n Titulo del libro=" + titulo + "\n Categoria del libro=" + categoria + "\n ISBN del libro=" + isbn + "\n Ejemplaresm del libro=" + ejemplares+"\n"
                + autor.toString() + "\n";
    }

}
