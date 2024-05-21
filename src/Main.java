import clases.Bus;
import clases.MiniBus;
import clases.Taxi;
import clases.Tienda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Clase Taxi - Método pagarPasaje
        Taxi taxi1 = new Taxi(500);
        taxi1.pagarPasaje(300);

        // Clase Bus - Método asientosDisponibles
        Bus bus1 = new Bus(5);
        bus1.asientosDisponibles();
        System.out.println(bus1.getCantidadAsientos());

        // Clase MiniBus - Método imprimeBus
        MiniBus miniBus1 = new MiniBus("rojo", "cwhz50", 5, "particular");
        miniBus1.imprimeBus();

        // Clase Tienda - Método existeStock
        Tienda valparaiso = new Tienda("La Vía", 50);
        System.out.println(valparaiso.existeStock(valparaiso.getStock()));

    }
}