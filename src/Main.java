import clases.*;

import java.util.ArrayList;
import java.util.List;

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


        // Guardar ventas en ficheros
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("3333333-3", "Ray", 38 ));
        clientes.add(new Cliente( "4444444-4", "Triny", 42));
        clientes.add(new Cliente("2222222-2", "Milena", 32));


        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Bus ("platino", "CDHZ32", 27));
        listaVehiculos.add(new Bus ("naranjo", "SZHH60", 31));
        listaVehiculos.add(new Taxi ("negro", "JKSS22", 3500));

        System.out.println(clientes);
        System.out.println(listaVehiculos);



        List<LibroVenta> libroVentas = new ArrayList<>();
        libroVentas.add(new LibroVenta("Venta directa", "01012024"));
        libroVentas.add(new LibroVenta("Venta crédito", "31052024"));
        libroVentas.add(new LibroVenta("Venta contado", "30042023"));

        System.out.println(libroVentas);

        for (int i = 0; i < libroVentas.size(); i++) {
            libroVentas.get(i).guardarVenta(libroVentas.get(i).getNombreVenta(), libroVentas.get(i).getFechaVenta(), listaVehiculos.get(i), clientes.get(i));
        }

        System.out.println(libroVentas);
    }
}