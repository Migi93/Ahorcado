/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador uno = new Jugador("UNO");
        Jugador dos = new Jugador("DOS");
        int partidas = 1;
        int contadorReseteoUno = 0;
        int contadorReseteoDos = 0;
        System.out.println(">>> Maximo 5 errores. Gana el mejor de 5 partidas <<<");
        while (uno.getPartidasganadas() < 3 && dos.getPartidasganadas() < 3) {
            System.out.println("PARTIDA NUMERO: " + partidas);
            System.out.println("*--*Turno para el jugador uno*--*");
            String palabrauno;
            System.out.println("Introduce la palabra para el juego: ");
            Scanner n = new Scanner(System.in);
            palabrauno = n.nextLine();
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
            Palabra p = new Palabra(palabrauno);
            if (contadorReseteoUno > 0) {
                p.resetearJuego(palabrauno, uno);
            }
            while ((p.getPalabracompleta() != p.longitudPalabra()) && (uno.getErrores() <= 4)) {
                System.out.println("\n");
                System.out.println("Partidas ganadas jugador UNO: " + uno.getPartidasganadas());
                System.out.println("Partidas ganadas jugador DOS: " + dos.getPartidasganadas());
                System.out.println("Errores cometidos: " + uno.getErrores());
                System.out.println("Introduce una letra para el jugador UNO: ");
                String letraUno = n.nextLine();
                p.introducirletra(letraUno.charAt(0), uno);
                p.letrasAcertadas();
                System.out.println("\n");
            }
            contadorReseteoUno++;
            if (uno.getErrores() == 5) {
                System.out.println("HAS PERDIDO POR COMETER 5 ERRORES");
            }
            System.out.println("\n*--*Turno para el jugador dos*--*");
            String palabrados;
            System.out.println("Introduce la palabra para el juego: ");
            palabrados = n.nextLine();
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
            Palabra pdos = new Palabra(palabrados);
            if (contadorReseteoDos > 0) {
                pdos.resetearJuego(palabrados, dos);
            }
            while ((pdos.getPalabracompleta() != pdos.longitudPalabra()) && (dos.getErrores() <= 4)) {
                System.out.println("\n");
                System.out.println("Partidas ganadas jugador UNO: " + uno.getPartidasganadas());
                System.out.println("Partidas ganadas jugador DOS: " + dos.getPartidasganadas());
                System.out.println("Errores cometidos: " + dos.getErrores());
                System.out.println("Introduce una letra para el jugador DOS: ");
                String letraUno = n.nextLine();
                pdos.introducirletra(letraUno.charAt(0), dos);
                pdos.letrasAcertadas();
                System.out.println("\n");
            }
            contadorReseteoDos++;
            if (dos.getErrores() == 5) {
                System.out.println("\nHAS PERDIDO POR COMETER 5 ERRORES");
            }
            partidas++;
        }
        if (uno.getPartidasganadas() < 3) {
            System.out.println("EL GANADOR DEL JUEGO ES EL JUGADOR NUMERO DOS");
        } else {
            System.out.println("EL GANADOR DEL JUEGO ES EL JUGADOR NUMERO UNO");
        }
    }
}
