public class Main {
        public static void main(String[] args) {

                // 1. Creamos la primera tarea
                Tarea tarea1 = new Tarea();
                tarea1.titulo = "Diseñar base de datos";
                tarea1.responsable = "César";
                tarea1.horasEstimadas = 5.5;
                tarea1.completada = false;

                // 2. Creamos la segunda tarea
                Tarea tarea2 = new Tarea();
                tarea2.titulo = "Programar API";
                tarea2.responsable = "Cris";
                tarea2.horasEstimadas = 8.0;
                tarea2.completada = false;

                // 3. Creamos la tercera tarea
                Tarea tarea3 = new Tarea();
                tarea3.titulo = "Pruebas de seguridad";
                tarea3.responsable = "Bruno";
                tarea3.horasEstimadas = 4.0;
                tarea3.completada = false;

                // --- PRUEBA DE INDEPENDENCIA ---
                // Completamos SOLAMENTE la tarea 1
                tarea1.completar();
                System.out.println("\n");

                // Comprobamos los resultados para ver que las demás no se afectaron
                tarea1.mostrarInformacion();

                System.out.println("\n-------------------\n");

                tarea2.mostrarInformacion();
        }
}