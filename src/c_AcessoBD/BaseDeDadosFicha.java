/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_AcessoBD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class BaseDeDadosFicha {
    static final String LIGACAO_BD = "jdbc:mysql://localhost:3306/arquivo"
            + "?useUnicode=true"
            + "&useJDBCCompliantTimezone=true"
            + "&useLeagacyDatetimeCode=false"
            + "&serverTimezone=UTC"
            + "&characterEncoding=utf8";
    
    public static void main(String[] args) {
        Statement stmt;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Temos driver");
            
            Connection conn = DriverManager.getConnection(LIGACAO_BD, "root", "mysql");
            
            
            // 4. Define um objeto de comando para enviar
            //    um comando pela ligação.
            
            stmt = conn.createStatement();
            
            conn.setAutoCommit(false);
            
            stmt.executeUpdate("DROP TABLE IF EXISTS Pessoa");
            stmt.executeUpdate("CREATE TABLE Pessoa " + "(ID int, Prinome VARCHAR(30),Apelido Varchar(30))");
            
            stmt.executeUpdate("INSERT INTO Pessoa VALUES(1,'Luis','Francisco')");
            stmt.executeUpdate("INSERT INTO Pessoa VALUES(2,'Pedro','Ferreira')");
            stmt.executeUpdate("INSERT INTO Pessoa VALUES(3,'Ana','Ferreira')");
            stmt.executeUpdate("INSERT INTO Pessoa VALUES(4,'Carlos','Ferreira')");
            
            stmt.executeUpdate("DELETE FROM Pessoa WHERE ID = 4");
            
            conn.commit();

            conn.setAutoCommit(true);
            rs = stmt.executeQuery("SELECT Prinome, Apelido " + "FROM Pessoa");

            System.out.println("Registos da tabela \"Pessoa\"");

            while (rs.next()) {
                String priNome = rs.getString(1);
                String apelido = rs.getString(2);
                System.out.println("============================");
                System.out.println("Primeiro nome= " + priNome);
                System.out.println("Apelido= " + apelido);
                System.out.println("============================");
            }
            
            conn.close();
            System.out.println("\nLigação com a " + "base de dados terminada");
        } catch (ClassNotFoundException ce)
        {
            System.out.println(ce.getMessage());
        } catch (SQLException e)
        {
            System.out.println("--- SQLExeption apanhada ---");
            while (e != null)
            {
                System.out.println("Mensagem:" + e.getMessage());
                System.out.println("SQLEstado:" + e.getSQLState());
                System.out.println("Código de erro:" + e.getErrorCode());
                System.out.println("---");
                e = e.getNextException();
            }

        } catch (Exception ex) {
            Logger.getLogger(BaseDeDadosFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
