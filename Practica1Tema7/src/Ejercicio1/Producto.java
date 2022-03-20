/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Producto {
    private String nombre;
    private int cantidad;
    
    
    public Producto(String nombre, int cantidad){
        this.cantidad=cantidad;
        this.nombre=nombre;
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public String toString() {
        return this.getNombre()+ this.getCantidad();

    }
}

