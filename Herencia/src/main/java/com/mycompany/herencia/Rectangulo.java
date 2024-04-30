/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author a21nadiami
 */
public class Rectangulo extends FiguraXeometrica{
    private float base; 
    private float altura; 

    public Rectangulo(String color, float base, float altura) {
        super(color); 
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double Area(){
        double area = (float) base * altura; 
        return area; 
    }
    
    @Override
    public double Perimetro(){
        double perimetro = base + altura; 
        return perimetro; 
    }
    
}
