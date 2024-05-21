package clases;

public class Bus extends Vehiculo {
    private int cantidadAsientos;

    public Bus() {

    }
    public Bus(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public Bus(String color, String patente, int cantidadAsientos) {
        super(color, patente);
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int asientosDisponibles() {
       return cantidadAsientos;
    }
    @Override
    public String toString() {
        return "Bus{" +
                "cantidadAsientos=" + cantidadAsientos +
                "} " + super.toString();
    }
}
