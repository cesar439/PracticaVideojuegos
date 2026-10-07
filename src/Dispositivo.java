public class Dispositivo {
    // atributos
    private String nombre;
    private String tipo;
    private boolean activo;

    // static
    private static int contador = 0;

    // constructor vacio
    public Dispositivo() {
        contador++;
    }

    // constructor con parametros
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;
        contador++;
    }

    // get (static)
    public static int getTotalCreados() {
        return contador;
    }

    // set
    public void setNombre(String nombre) {
        // validacion
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    // get
    public String getNombre() {
        return this.nombre;
    }

    // set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // get
    public String getTipo() {
        return this.tipo;
    }

    // set
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // get
    public boolean isActivo() {
        return this.activo;
    }

    // activar
    public void activar() {
        this.activo = true;
        System.out.println("-> Dispositivo " + this.nombre + " encendido.");
    }

    // desactivar
    public void desactivar() {
        this.activo = false;
        System.out.println("-> Dispositivo " + this.nombre + " apagado.");
    }
}