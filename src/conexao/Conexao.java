/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static final String url = "jdbc:mysql://localhost/db_biblioteca";
    public static final String user = "root";
    public static final String pass = "";
    
    public static Connection createConnection(){
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection con = createConnection();
        
        if(con!=null){
            con.close();
            JOptionPane.showMessageDialog(null,"Conexão bem sucedida.");
        }
    }
}
