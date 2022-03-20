/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import Ejercicio1.Producto;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList astros = new ArrayList();
         
          Astros a1 = new Astros(350,5,3,54,4);
          Planetas p1= new Planetas(450,"Si","No");
          Satelites s1= new Satelites(100,"Eliptica","Tierra");
          
          astros.add(p1);
          astros.add(a1);
          astros.add(s1);
          Iterator it = astros.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
          
          
    }
    
}
