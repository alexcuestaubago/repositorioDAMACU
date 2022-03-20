/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public abstract class Astros {

    int radio_ecuatorial;
   protected int rotacion, temp_media, masa, gravedad;
   private String nombre;
    
    
    public Astros( int radio_ecuatorial, int rotacion, int temp_media, int masa, int gravedad){
        this.radio_ecuatorial=radio_ecuatorial;
        this.rotacion=rotacion;
        this.temp_media=temp_media;
        this.gravedad=gravedad;    
    }
    
    public void mostrarAstro(){
        System.out.println("Radio ecuatorial: "+this.radio_ecuatorial);
        System.out.println("Masa: "+this.masa);
        System.out.println("Rotacion: "+this.rotacion);
        System.out.println("Temperatura media: "+this.temp_media);
    
    }
    
    
    
    public int getRadio_ecuatorial() {
        return radio_ecuatorial;
    }

    public void setRadio_ecuatorial(int radio_ecuatorial) {
        this.radio_ecuatorial = radio_ecuatorial;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    public int getTemp_media() {
        return temp_media;
    }

    public void setTemp_media(int temp_media) {
        this.temp_media = temp_media;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    
}
