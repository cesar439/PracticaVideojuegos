public class Main {
        public static void main(String[] args) {

                // 1. Creación del sensor de temperatura
                Sensor sensorTemp = new Sensor();
                sensorTemp.nombre = "Sensor DHT11";
                sensorTemp.tipo = "Temperatura";
                sensorTemp.lectura = 22.5;
                sensorTemp.unidad = "°C";

                // 2. Creación del sensor de presión
                Sensor sensorPresion = new Sensor();
                sensorPresion.nombre = "Sensor BMP280";
                sensorPresion.tipo = "Presión";
                sensorPresion.lectura = 1013.25;
                sensorPresion.unidad = "hPa";

                // 3. Creación del sensor de humedad
                Sensor sensorHumedad = new Sensor();
                sensorHumedad.nombre = "Sensor HR202";
                sensorHumedad.tipo = "Humedad";
                sensorHumedad.lectura = 45.0;
                sensorHumedad.unidad = "%";

                // --- PRUEBA DE MÉTODOS ---
                // Actualizamos la lectura de un solo sensor
                sensorTemp.actualizarLectura(25.8);
                System.out.println("\n");

                // Comprobamos la información
                sensorTemp.mostrarInformacion();

                System.out.println("\n-------------------\n");

                sensorPresion.mostrarInformacion();
        }
}