public class Main {
        public static void main(String[] args) {

                // static inicial
                System.out.println("Total inicial: " + Dispositivo.getTotalCreados());

                // creacion vacia (Ejercicio 2)
                Dispositivo d1 = new Dispositivo();

                // set
                d1.setNombre("Laptop Gamer");
                d1.setTipo("Computadora");
                d1.setActivo(false);

                // creacion con parametros (Ejercicio 3)
                Dispositivo d2 = new Dispositivo("Servidor Web", "Servidor");

                // get
                System.out.println("\n--- Datos ---");
                System.out.println("D1: " + d1.getNombre() + " | " + d1.getTipo());
                System.out.println("D2: " + d2.getNombre() + " | " + d2.getTipo());

                // validacion
                System.out.println("\n--- Prueba de error ---");
                d1.setNombre("");

                // activar y desactivar
                System.out.println("\n--- Acciones ---");
                d1.activar();
                d2.desactivar();

                // get final
                System.out.println("\n--- Estado final ---");
                System.out.println(d1.getNombre() + " activo: " + d1.isActivo());
                System.out.println(d2.getNombre() + " activo: " + d2.isActivo());

                // static final
                System.out.println("\nTotal final de dispositivos: " + Dispositivo.getTotalCreados());
        }
}