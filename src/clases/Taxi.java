package clases;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi() {

    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                '}';
    }

    public void pagarPasaje(int montoPagado) {
        int vuelto = 0;
        int faltaPago = 0;
        if (montoPagado >= this.valorPasaje) {
            vuelto = montoPagado - this.valorPasaje;
            System.out.println("El vuelto a entregar al cliente es de: " + vuelto);

        } else if(montoPagado < this.valorPasaje) {
            faltaPago = this.valorPasaje - montoPagado;
            System.out.println("Monto pagado no alcanza para pagar el pasaje. Debe pagar: $ " + faltaPago + " adicionales.");
        }
    }

}