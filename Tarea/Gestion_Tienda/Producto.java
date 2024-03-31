// nombre (String): Nombre del producto.
// categoria (Categoria): Categoría del producto.
// precio (double): Precio de venta del producto.
// stock (int): Cantidad de unidades del producto en stock



public class Producto {
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;
    
    public Producto() {
    }
    public Producto(String nombre, Categoria categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria.toString() + ", precio=" + precio + ", stock=" + stock
                + "]";
    }

    
}
