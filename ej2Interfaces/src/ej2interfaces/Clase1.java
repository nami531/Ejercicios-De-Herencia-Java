/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2interfaces;

/**
 *
 * @author a21nadiami
 */
public class Clase1 implements MiInterfaz, Constantes {
    
    private int dato; 

    public Clase1() {}
    
    @Override
    public void put(int dato){
        this.dato = dato; 
    }
    
    @Override
    public int get(){
        return dato; 
    } 
    
    public void show(){
        System.out.println("Clase 1: Dato=" + dato);
    }
    
}
