package clases;

public class MiniBus extends Bus {
    private String tipoViaje;

    public MiniBus() {

    }
    public MiniBus(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public MiniBus(int cantidadAsientos, String tipoViaje) {
        super(cantidadAsientos);
        this.tipoViaje = tipoViaje;
    }

    public MiniBus(String color, String patente, int cantidadAsientos, String tipoViaje) {
        super(color, patente, cantidadAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "MiniBus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                "} " + super.toString();
    }
}
