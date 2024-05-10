/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej7;

/**
 *
 * @author a21nadiami
 */
public enum TipoMadera {
    CARBALLO(40),
    SAPELLY(50), 
    NOGUEIRA(60),
    CERDEIRA(70), 
    BAMBU(100);
    private int precio;
    
    TipoMadera(int precio){
        this.precio = precio; 
    }
    
}
