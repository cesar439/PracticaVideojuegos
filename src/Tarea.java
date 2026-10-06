public class Tarea {
    // 1. Atributos public
    public String titulo; //
    public String responsable; //

    // 2. Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // 3. Métodos public
    public void mostrarInformacion() {
        System.out.println("--- Datos de la Tarea ---");
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas + " horas");
        System.out.println("¿Completada?: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println(">> ¡La tarea '" + titulo + "' ha sido COMPLETADA!");
    }

    // 4. Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("El responsable asignado es: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de la tarea: " + (completada ? "Finalizada" : "Pendiente"));
    }
}