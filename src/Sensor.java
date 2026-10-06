public class Sensor {
    // Atributos public
    public String nombre;
    public double lectura;

    // Atributos con acceso por defecto
    String tipo;
    String unidad;

    // Métodos public
    public void mostrarInformacion() { //
        System.out.println("--- Datos del Sensor ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura actual: " + lectura + " " + unidad);
    }

    public void actualizarLectura(double nuevaLectura) {
        lectura = nuevaLectura;
        System.out.println(">> Lectura de " + nombre + " actualizada a: " + lectura + " " + unidad);
    }

    // Métodos con acceso por defecto
    void mostrarLectura() {
        System.out.println("Lectura: " + lectura + " " + unidad);
    }

    void reiniciarLectura() {
        lectura = 0.0;
        System.out.println("Lectura de " + nombre + " reiniciada a 0.0");
    }
}