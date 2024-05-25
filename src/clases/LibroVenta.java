package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;
    private Cliente cliente;
    private Vehiculo vehiculo;


    public LibroVenta() {

    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }
    public LibroVenta(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }



    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void guardarVenta(String nombreVenta, String fechaVenta, Vehiculo vehiculo, Cliente cliente)  {
        File directorio = new File("src", "ficheros");
        File archivo = new File(directorio, getNombreVenta().concat( ".txt"));

        int fechaDeVenta = Integer.parseInt(fechaVenta);

        try {
            if(!directorio.exists()) {
                directorio.mkdir();
            }
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch(IOException e ) {
            System.out.println("Error creando archivo" + e.getMessage());
        }

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(archivo))){
           bf.write("Nombre de Venta: " + nombreVenta);
           bf.newLine();
           bf.write("Fecha de Venta: " + fechaDeVenta);
           bf.newLine();
           bf.write("Número de Patente: " + vehiculo.getPatente());
           bf.newLine();
           bf.write("Edad de Cliente: " + cliente.getEdad());

            System.out.println("Datos guardados correctamente");

        } catch(IOException e) {
            System.out.println("Error al guardar información" + e.getMessage());
        }


    }
    @Override
    public String toString() {
        return "LibroVenta{" +
                "nombreVenta='" + nombreVenta + '\'' +
                ", fechaVenta='" + fechaVenta + '\'' +
                '}';
    }
}
