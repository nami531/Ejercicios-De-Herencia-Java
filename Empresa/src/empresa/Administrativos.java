/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author a21nadiami
 */
public class Administrativos extends Trabajador {
    private String estudios; 
    private int idPc; 

    public Administrativos(String estudios, int idPc, String nome, int salarioBase, int idade) {
        super(nome, salarioBase, idade);
        this.estudios = estudios;
        this.idPc = idPc;
    }
    
    @Override
    public void visualizarTodosDatos(){
        System.out.println(this);
    }  

    @Override
    public String toString() {
        return "Administrativos{" + super.toString() + "estudios=" + estudios + ", idPc=" + idPc + '}';
    }
    
    
    
}
