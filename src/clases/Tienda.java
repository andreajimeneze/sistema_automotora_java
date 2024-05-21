package clases;

public class Tienda {
private String nombreTienda;
private int Stock;
private Vendedor vendedor;
private Cliente cliente;
private Vehiculo vehiculo;

    public Tienda(String nombreTienda, int stock, Vendedor vendedor, Cliente cliente, Vehiculo vehiculo) {
        this.nombreTienda = nombreTienda;
        Stock = stock;
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
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
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
                ", Stock=" + Stock +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
