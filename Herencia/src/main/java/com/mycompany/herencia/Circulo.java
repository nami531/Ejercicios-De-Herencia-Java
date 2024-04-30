/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author a21nadiami
 */
public class Circulo extends FiguraXeometrica{
    
    private float radio; 

    public Circulo(String color, float radio) {
        super(color); 
        this.radio = radio;
    }
    
    @Override
    public double Area(){
        double area = Math.PI * Math.pow(radio, 2); 
        return area; 
    }
    
    @Override
    public double Perimetro(){
        double perimetro = 2 * Math.PI * radio; 
        return perimetro; 
    }
}
