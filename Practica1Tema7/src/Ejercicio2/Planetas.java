/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Planetas extends Astros {
    private int distancia_sol;
    private String tiene_Satelites, orbita_sol;
    
    
    
     public Planetas( int distancia_sol, String tiene_satelites, String orbita_sol, int radio_ecuatorial, int rotacion, int temp_media, int masa, int gravedad){
     super( radio_ecuatorial,  rotacion, temp_media, masa, gravedad);
         
        this.distancia_sol=distancia_sol;
        this.tiene_Satelites=tiene_satelites;
        this.orbita_sol=orbita_sol;
    }

    public String getOrbita_sol() {
        return orbita_sol;
    }

    public void setOrbita_sol(String orbita_sol) {
        this.orbita_sol = orbita_sol;
    }
    
    

    public float getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }


    public String getTiene_Satelites() {
        return tiene_Satelites;
    }

    public void setTiene_Satelites(String tiene_Satelites) {
        this.tiene_Satelites = tiene_Satelites;
    }
    
    @Override
    public String toString(){
        return this.getOrbita_sol()+this.getTiene_Satelites()+this.getDistancia_sol();
    
    }
    
}
