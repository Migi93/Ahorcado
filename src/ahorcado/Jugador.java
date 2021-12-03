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
public class Jugador {
    private String nombreJugador;
    private int aciertos;
    private int partidasganadas;
    
    public Jugador(String nombre){
    aciertos = 0;
    this.nombreJugador = nombre;
    partidasganadas = 0;
    }
    
    public int aciertos(){
        return aciertos++;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getPartidasganadas() {
        return partidasganadas;
    }

    public void setPartidasganadas(int partidasganadas) {
        this.partidasganadas = partidasganadas;
    }
    
    
   
}
