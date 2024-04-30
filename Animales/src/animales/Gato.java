/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author a21nadiami
 */
public class Gato extends Animal {
    private int vidas; 

    public Gato(String nome, int idade) {
        super(nome, idade);
        this.vidas = 7;
    }

    public int getVidas() {
        return vidas;
    }

    public void restarVida(int vidas) {
        this.vidas--;
    }
    
}
