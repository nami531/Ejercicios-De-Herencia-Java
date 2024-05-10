/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package conexionbd;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author a21nadiami
 */
public class ConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Que ciudad quieres buscar: ");
        Scanner sc = new Scanner(System.in);        
        String var = sc.next(); 
        String sql = "SELECT continent FROM COUNTRY";
        String sql2 = "INSERT INTO CITY(Name, countrycode,district, population) VALUES ('Mos','ESP','Vigo', '20000')"; 
        String sqlParametrizada = "Select * from city where name = ? ";
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement(sqlParametrizada);
           
            // ResultSet resultado = sentencia.executeQuery();
            ){
            
            sentencia.setString(1, var ); 
            // int numFilas = sentencia.executeUpdate(); 
            ResultSet resultado = sentencia.executeQuery(); 
            
            
            System.out.println("Conexion OK");
            while(resultado.next()){
                System.out.println( resultado.getString("Population"));
            }
            // System.out.println(numFilas);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
