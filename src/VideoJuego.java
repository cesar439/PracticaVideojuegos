public class VideoJuego {
    public String nombre;
    public String genero;

    String version;
    boolean activo;

    //metodos public
    public void mostrarInformacion(){
        System.out.println("--- Datos del Videojuego ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Version: " + version);
        System.out.println("¿Está activo?: " + activo);
    }
    public void iniciar(){
        activo = true;
        System.out.println("Iniciando " + nombre + "...");
    }
    //metodos con acceso por defecto
    void cerrar() {
        activo = false;
        System.out.println("Cerrando " + nombre + "...");
    }
    void mostrarversion() {
        System.out.println("La version actual de " + nombre + " es: " + version);
    }
}
