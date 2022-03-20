/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Satelites extends Astros{
    private int distancia_planeta;
    private String orbita,planeta_perteneciente;
    
     public Satelites ( int distancia_planeta, String orbita, String planeta_perteneciente, int radio_ecuatorial, int rotacion, int temp_media, int masa, int gravedad){
        super( radio_ecuatorial,  rotacion, temp_media, masa, gravedad);
        this.distancia_planeta=distancia_planeta;
        this.orbita=orbita;
        this.planeta_perteneciente=planeta_perteneciente;
    }

    public float getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(int distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getPlaneta_perteneciente() {
        return planeta_perteneciente;
    }

    public void setPlaneta_perteneciente(String planeta_perteneciente) {
        this.planeta_perteneciente = planeta_perteneciente;
    }
    
    @Override
    public String toString(){
        return this.getOrbita()+this.getPlaneta_perteneciente()+this.getDistancia_planeta();
    
    }
    
}
