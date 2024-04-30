/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author a21nadiami
 */
public class Maquinistas extends Trabajador{
    private int idMaq; 
    private int anos; 

    public Maquinistas(int idMaq, int anos, String nome, int salarioBase, int idade) {
        super(nome, salarioBase, idade);
        this.idMaq = idMaq;
        this.anos = anos;
    }

    @Override
    public void visualizarTodosDatos(){
        System.out.println(this);
    }  

    @Override
    public String toString() {
        return "Maquinistas{"+ super.toString() + "idMaq=" + idMaq + ", anos=" + anos + '}';
    }
    
}
