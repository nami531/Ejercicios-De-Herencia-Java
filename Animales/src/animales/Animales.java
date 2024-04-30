/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import java.util.ArrayList;

/**
 *
 * @author a21nadiami
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>(); 
        Gato g = new Gato("Misifu", 12); 
        Can p = new Can("Pastor Alemán", "Firulais", 1); 
        animales.add(p); 
        animales.add(g); 
         
        Gato gato = (Gato) animales.get(0); 
        Can perro = (Can) animales.get(0); 
        
        gato.getVidas(); 
        gato.restarVida(2);
        gato.getVidas(); 
    }
    
}
