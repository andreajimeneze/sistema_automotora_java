import clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Clase Taxi - Método pagarPasaje
        Taxi taxi1 = new Taxi(500);
        taxi1.pagarPasaje(300);

        // Clase Bus - Método asientosDisponibles
        Bus bus1 = new Bus("blanco", "WD XZ 12", 5 );
        bus1.asientosDisponibles();
        System.out.println(bus1.getCantidadAsientos());

        // Clase MiniBus - Método imprimeBus
        MiniBus miniBus1 = new MiniBus("rojo", "cwhz50", 5, "particular");
        miniBus1.imprimeBus();

        // Clase Tienda - Método existeStock
        Tienda valparaiso = new Tienda("La Vía", 50);
        System.out.println(valparaiso.existeStock(valparaiso.getStock()));

        Cliente cliente1 = new Cliente(38);

        Cliente cliente2 = new Cliente(42);


        LibroVenta venta1 = new LibroVenta("Venta Directa", "01012024",  cliente1, miniBus1);

        venta1.guardarVenta(venta1.getNombreVenta(), venta1.getFechaVenta(),miniBus1, cliente1 );
        System.out.println(venta1);

        LibroVenta venta2 = new LibroVenta("Venta contado", "30042023",  cliente2, bus1);
        venta2.guardarVenta(venta2.getNombreVenta(), venta2.getFechaVenta(),bus1, cliente2 );
        System.out.println(venta2);

        LibroVenta venta3 = new LibroVenta("Venta crédito", "31052024",  cliente2, bus1);
        venta3.guardarVenta(venta3.getNombreVenta(), venta3.getFechaVenta(),bus1, cliente2 );
        System.out.println(venta3);
    }
}