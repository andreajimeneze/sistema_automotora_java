package clases;

public class Cliente extends Persona {
    private int edad;

    public Cliente() {

    }
    public Cliente(int edad) {
        this.edad = edad;
    }

    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "edad=" + edad +
                "} " + super.toString();
    }
}
