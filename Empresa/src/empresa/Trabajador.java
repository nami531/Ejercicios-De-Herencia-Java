/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author a21nadiami
 */
public class Trabajador {
    private String nome; 
    private int salarioBase; 
    private int idade; 

    public Trabajador(String nome, int salarioBase, int idade) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void visualizarTodosDatos(){
        System.out.println("nome=" + nome + ", salarioBase=" + salarioBase + ", idade=" + idade);
    }

    
    
}
