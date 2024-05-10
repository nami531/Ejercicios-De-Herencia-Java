/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author a21nadiami
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce tu peso: ");
        Scanner sc = new Scanner(System.in);        
        Double peso = sc.nextDouble(); 
        
        for(Planeta pl : Planeta.values()){
            System.out.println("Tu peso en " + pl + " es de " + pl.pesoSuperficie(peso) + " kg");
        }
            
        
    }
    
}
