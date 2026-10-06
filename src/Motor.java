public class Motor {
    // Atributos public
    public String nombre; //
    public double potencia;

    // Atributos con acceso por defecto
    double velocidad;
    boolean encendido;

    // Métodos public
    public void encender() {
        encendido = true;
        System.out.println(">> ¡El motor '" + nombre + "' ha sido ENCENDIDO!");
    }

    public void mostrarInformacion() {
        System.out.println("--- Datos del Motor ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Potencia: " + potencia + " HP");
        System.out.println("Velocidad: " + velocidad + " RPM");
        System.out.println("¿Está encendido?: " + encendido);
    }

    // Métodos con acceso por defecto
    void apagar() {
        encendido = false;
        System.out.println(">> El motor '" + nombre + "' ha sido APAGADO.");
    }

    void mostrarEstado() {
        System.out.println("Estado actual de " + nombre + ": " + (encendido ? "Encendido" : "Apagado"));
    }
}