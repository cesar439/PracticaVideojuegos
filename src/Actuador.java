public class Actuador {
    // Atributos public
    public String codigo; //
    public String tipo;

    // Atributos con acceso por defecto
    double posicion;
    boolean activo;

    // Métodos public
    public void activar() {
        activo = true;
        System.out.println(">> ¡Actuador " + codigo + " ACTIVADO!");
    }

    public void cambiarPosicion(double nuevaPosicion) {
        posicion = nuevaPosicion;
        System.out.println(">> La posición del actuador " + codigo + " cambió a: " + posicion);
    }

    // Métodos con acceso por defecto
    void desactivar() {
        activo = false;
        System.out.println(">> Actuador " + codigo + " DESACTIVADO.");
    }

    void mostrarInformacion() {
        System.out.println("--- Datos del Actuador ---");
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Posición actual: " + posicion);
        System.out.println("¿Está activo?: " + activo);
    }
}