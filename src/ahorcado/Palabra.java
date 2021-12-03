/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author usuario
 */
public class Palabra {

    private String palabra;
    private char[] letrasAcertadas;
    private char[] letrasfalladas;
    private int palabracompleta;
    private StringBuilder letras;

    public Palabra(String palabra) {
        this.palabra = palabra;
        this.palabracompleta = 0;
        letrasAcertadas = new char[10];
        letrasfalladas = new char[5];
        letras = new StringBuilder();
    }
    
    public void resetearJuego(String palabra, Jugador jugador){
        this.palabracompleta = 0;
        letras = new StringBuilder();
        setPalabra(palabra);
        letrasAcertadas = new char[10];
        letrasfalladas = new char[5];
        jugador.setAciertos(0);
        jugador.setErrores(0);
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public void introducirletra(char letra, Jugador j) {
        letrasIntroducidas(letra);
        char[] letras = palabra.toCharArray();
        System.out.println("-> La palabra contiene " + letras.length + " letras");
        boolean encontrado = false;
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                System.out.println("--- ACIERTO. La letra -> " + letras[i] + " <- esta en la posicion >> " + (i + 1) + " de la palabra.");
                letrasAcertadas[i] = letra;
                palabracompleta++;
                encontrado = true;
                j.sumaAcierto();
                if (palabracompleta == letras.length) {
                    juegoTerminado();
                    j.sumaPartidaGanada();
                }
            }
        }
        if (encontrado == false) {
            System.out.println("--- ERROR. La letra >> " + letra + " << no esta en la palabra---");
            j.sumaError();
        }
    }

    public void letrasIntroducidas(char letra) {
        letras.append(letra);
        System.out.println("\n-> Letras introducidas: " + letras);
    }

    public void juegoTerminado() {
        System.out.println("CORRECTO, ESA ES LA PALABRA.");
    }

    public void letrasAcertadas() {
        System.out.println("\n***Letras que estan en la palabra***");
        System.out.println(letrasAcertadas);

    }

    public int getPalabracompleta() {
        return palabracompleta;
    }

    public int longitudPalabra() {
        return palabra.toCharArray().length;
    }

}
