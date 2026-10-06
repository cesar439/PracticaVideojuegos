public class Main {
        public static void main(String[] args) {

                // 1. Creamos el primer motor
                Motor motor1 = new Motor();
                motor1.nombre = "Motor Cinta Transportadora";
                motor1.potencia = 5.0;
                motor1.velocidad = 1500.0;
                motor1.encendido = false;

                // 2. Creamos el segundo motor
                Motor motor2 = new Motor();
                motor2.nombre = "Motor Extractor de Aire";
                motor2.potencia = 2.5;
                motor2.velocidad = 3000.0;
                motor2.encendido = false;

                // 3. Creamos el tercer motor
                Motor motor3 = new Motor();
                motor3.nombre = "Motor Bomba de Agua";
                motor3.potencia = 10.0;
                motor3.velocidad = 2800.0;
                motor3.encendido = false;

                // --- PRUEBA DE INDEPENDENCIA ---
                // Encendemos y luego apagamos SOLO el motor 1
                motor1.encender();
                motor1.apagar();
                System.out.println("\n");

                // Comprobamos los resultados para verificar que los demás no cambiaron
                motor1.mostrarInformacion();

                System.out.println("\n-------------------\n");

                motor2.mostrarInformacion();
        }
}