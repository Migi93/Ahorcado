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
    private StringBuilder letrasfalladas;
    
    public Palabra(String palabra){
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public void Introducirletra(char letra){
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if(letra == letras[i]){
                letrasAcertadas[i] = letra;
            } else {
                letrasAcertadas[i] = '*';
                letrasfalladas.append(" " + letra);
            }
        }
    }
    
    public void letrasFalladas(){
        System.out.println("Las letras que no estan en la palabra son: ");
        System.out.println(letrasfalladas);
    }
    
    public void letrasAcertadas(){
        for (int i = 0; i < letrasAcertadas.length; i++) {
            System.out.println(letrasAcertadas[i]);
        }
    }
    
}
