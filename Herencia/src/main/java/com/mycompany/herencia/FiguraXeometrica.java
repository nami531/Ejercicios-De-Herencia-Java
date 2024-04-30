/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author a21nadiami
 */
public abstract class FiguraXeometrica {
    
    private String color; 

    public FiguraXeometrica(String color) {
        this.color = color;
    }
    
    public abstract double Area();
    
    public abstract double Perimetro(); 
}
