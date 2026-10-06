public class Main {
        public static void main(String[] args) {

                // 1. Creamos el objeto Login
                Modulo login = new Modulo();
                login.nombre = "Login";
                login.lenguaje = "Java";
                login.version = "1.0";
                login.terminado = false;

                // 2. Creamos el objeto Inventario
                Modulo inventario = new Modulo();
                inventario.nombre = "Inventario";
                inventario.lenguaje = "Python";
                inventario.version = "2.5";
                inventario.terminado = false;

                // 3. Creamos el objeto Reportes
                Modulo reportes = new Modulo();
                reportes.nombre = "Reportes";
                reportes.lenguaje = "SQL";
                reportes.version = "1.1";
                reportes.terminado = false;

                // --- PRUEBA DE INDEPENDENCIA ---
                // Marcamos como terminado SOLO el módulo de Login
                login.marcarTerminado();
                System.out.println("\n"); // Salto de línea

                // Mostramos la informacion para comprobar que los demás siguen en 'false'
                login.mostrarInformacion();
                System.out.println("\n-------------------\n");
                inventario.mostrarInformacion();
        }
}