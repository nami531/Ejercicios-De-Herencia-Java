/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2interfaces;

/**
 *
 * @author a21nadiami
 */
public class Clase2 implements Constantes, MiInterfaz {
    
    private int dato; 

    public Clase2() {}
    
    @Override
    public void put(int dato){
        this.dato = dato; 
    }
    
    @Override
    public int get(){
        return dato; 
    } 
}
