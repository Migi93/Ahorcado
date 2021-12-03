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
    private final String nombreJugador;
    private int aciertos;
    private int partidasganadas;
    private int errores;
    
    public Jugador(String nombre){
    this.aciertos = 0;
    this.nombreJugador = nombre;
    this.partidasganadas = 0;
    this.errores = 0;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }
    
    public int sumaAcierto(){
        aciertos++;
        return aciertos;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPartidasganadas() {
        return partidasganadas;
    }

    public void sumaPartidaGanada() {
        partidasganadas++;
    }
    
    public int sumaError(){
        errores++;
        return errores;
    }

    public int getErrores() {
        return errores;
    }
   
}
