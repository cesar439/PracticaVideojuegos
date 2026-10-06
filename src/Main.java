public class Main {
        public static void main(String[] args){

                //Instanciación: El primer juego a partir del plano.
                VideoJuego juego1 = new VideoJuego();

                //Valores a los atributos del 'juego1'
                juego1.nombre = "Minecraft ";
                juego1.genero = "Sandbox";
                juego1.version = "1.20";
                juego1.activo = false; // Empezamos con el juego apagado

                //El segundo juego.
                VideoJuego juego2 = new VideoJuego();
                juego2.nombre = "League of Legends";
                juego2.genero = "MOBA";
                juego2.version = "14.4";
                juego2.activo = false;

                //El tercer juego.
                VideoJuego juego3 = new VideoJuego();
                juego3.nombre = "Albion Online";
                juego3.genero = "MMORPG";
                juego3.version = "Crystal Raider";
                juego3.activo = false;

                //Ejecución de acciones: Prueba de métodos
                // Mandamos a iniciar SOLO el juego1
                juego1.iniciar();

                System.out.println("\n");

                // Mostramos la información de dos juegos para comprobar qué pasó
                juego1.mostrarInformacion();

                System.out.println("\n--- Separador ---\n");

                juego2.mostrarInformacion();
        }
}