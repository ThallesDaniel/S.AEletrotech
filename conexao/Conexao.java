/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno_Manha
 */
public class Conexao {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/eletrotech";
    
    
    public static Connection createConnectionToMysql() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        
        return connection;
}
    public static void main(String[] args) throws Exception {
   
        Connection con = createConnectionToMysql();
        
        if(con != null){
        
            System.out.println("funfou");
            con.close();
            
        }
        
    }
}
