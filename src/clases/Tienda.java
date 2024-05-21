package clases;

public class Tienda {
private String nombreTienda;
private int stock;
private Vendedor vendedor;
private Cliente cliente;
private Vehiculo vehiculo;

public Tienda() {

}

public Tienda(String nombreTienda, int stock) {
    this.nombreTienda = nombreTienda;
    this.stock = stock;
}
    public Tienda(String nombreTienda, int stock, Vendedor vendedor, Cliente cliente, Vehiculo vehiculo) {
        this.nombreTienda = nombreTienda;
        this.stock = stock;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombreTienda='" + nombreTienda + '\'' +
                ", Stock=" + stock +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }

    public String existeStock(int stock) {
      return stock > 0 ? "El stock es de: " + stock : "No hay stock";
    }
}
