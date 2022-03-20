/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 ESTE COMENTARIO ES NUEVO
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Creamos el arraylist 
        ArrayList listaProductos = new ArrayList();
        
        //Creamos los objetos
        Producto p1 = new Producto("Regla ", 12);
        Producto p2 = new Producto("Tomate ", 100);
        Producto p3 = new Producto("Lapiz ",30);
        Producto p4 = new Producto("Estuche ", 23);
        Producto p5 = new Producto("Boli ", 334);
        
        //Añadimos los objetos al array list
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        
        //Aqui mostramos el contenido del arraylist con un iterador
        Iterator it = listaProductos.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        
        //Quitamos dos objetos del arraylist
        listaProductos.remove(p1);
        listaProductos.remove(p3); 
        
       //Añadimos un nuevo elemento en medio de la lista
       listaProductos.add(3,p3);
       
       //Volvemos a mostrar el contenido del array
       Iterator it2 = listaProductos.iterator();
       while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println();
        
       //Eliminamos todos los elementos del array
       listaProductos.clear();
    }
    
}
