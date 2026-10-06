public class Main {
        public static void main(String[] args) {

                // 1. Creamos el primer actuador
                Actuador actuador1 = new Actuador();
                actuador1.codigo = "ACT-VALVULA-01";
                actuador1.tipo = "Neumático";
                actuador1.posicion = 0.0;
                actuador1.activo = false;

                // 2. Creamos el segundo actuador
                Actuador actuador2 = new Actuador();
                actuador2.codigo = "ACT-BRAZO-02";
                actuador2.tipo = "Hidráulico";
                actuador2.posicion = 15.5;
                actuador2.activo = false;

                // 3. Creamos el tercer actuador
                Actuador actuador3 = new Actuador();
                actuador3.codigo = "ACT-MOTOR-03";
                actuador3.tipo = "Eléctrico";
                actuador3.posicion = 90.0;
                actuador3.activo = false;

                // --- PRUEBA DE INDEPENDENCIA ---
                // Activamos y cambiamos la posición SOLO del primer actuador
                actuador1.activar();
                actuador1.cambiarPosicion(45.5);
                System.out.println("\n");

                // Comprobamos los resultados
                actuador1.mostrarInformacion();

                System.out.println("\n-------------------\n");

                actuador2.mostrarInformacion();
        }
}