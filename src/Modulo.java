public class Modulo {
    // 1. Atributos public
    public String nombre;
    public String lenguaje; //

    // 2. Atributos con acceso por defecto
    String version;
    boolean terminado;

    // 3. Métodos public
    public void mostrarInformacion() {
        System.out.println("--- Información del Módulo ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("¿Terminado?: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true; // Cambiamos el estado
        System.out.println(">> El módulo " + nombre + " se ha marcado como TERMINADO.");
    }

    // 4. Métodos con acceso por defecto
    void mostrarEstado() { //
        System.out.println("Estado de " + nombre + ": " + terminado);
    }

    void mostrarVersion() { //
        System.out.println("Versión actual: " + version);
    }
}