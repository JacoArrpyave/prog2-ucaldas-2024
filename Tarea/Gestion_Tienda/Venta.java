// producto (Producto): Producto vendido.
// cantidad (int): Cantidad de unidades del producto vendidas.
// fechaVenta (Date): Fecha en la que se realizó la venta.

import java.sql.Date;

public class Venta {
    private Producto producto;
    private int cantidad;
    private Date fechaVenta;
    public Venta(Producto producto, int cantidad, Date fechaVenta) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    @Override
    public String toString() {
        return "Venta [producto=" + producto + ", cantidad=" + cantidad + ", fechaVenta=" + fechaVenta + "]";
    }
    
    
}
