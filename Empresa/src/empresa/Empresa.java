/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author a21nadiami
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        System.out.println("¿Cuántos administrativos quieres registrar?");
        int numAdministrativos = sc.nextInt(); 
        
        System.out.println("¿Cuántos maquinistas quieres registrar?");
        int numMaquinistas = sc.nextInt(); 
        
        System.out.println("¿Cuántos administrativos quieres registrar?");
        int numTrabajadores = sc.nextInt(); 
        
        ArrayList<Trabajador> empresa = new ArrayList<>(numAdministrativos + numMaquinistas + numTrabajadores); 
        
        for (int i = 0; i < empresa.size(); i++) {
            System.out.println("Introduce el nombre");
            String nombre = sc.next(); 
            System.out.println("Introduce el salario base");
            int salarioBase = sc.nextInt(); 
            System.out.println("Introduce la edad");
            int edad = sc.nextInt(); 
            if (i <= numAdministrativos){
                System.out.println("Introduce los estudios");
                String estudios = sc.next(); 
                System.out.println("Introduce el id del Pc");
                int id = sc.nextInt(); 
                Administrativos a = new Administrativos(estudios, id, nombre, salarioBase, edad);  
                empresa.add(a); 
            } else if (i <= numAdministrativos + numMaquinistas) {
                System.out.println("Introduce el id de la máquina");
                int idMaq = sc.nextInt();
                System.out.println("Introduce cuantos años tiene la máquina");
                int anhosMaq = sc.nextInt();
                Maquinistas m = new Maquinistas(idMaq, anhosMaq, nombre, salarioBase, edad); 
                empresa.add(m); 
            } else {
                Trabajador t = new Trabajador(nombre, salarioBase, edad); 
                empresa.add(t); 
            }
            
        }
    }
    
}
