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
        Jugador uno = new Jugador("Migue");
        Jugador dos = new Jugador("Pablo");
        String palabra;
        System.out.println("Introduce la palabra para el juego: ");
        Scanner n = new Scanner(System.in);
        palabra = n.nextLine();
        Palabra p = new Palabra(palabra);
        
    }
    
}
