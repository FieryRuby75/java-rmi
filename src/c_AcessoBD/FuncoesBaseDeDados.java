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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class FuncoesBaseDeDados {
    static final String LIGACAO_BD = "jdbc:mysql://localhost:3306/basket_6735639"
            + "?useUnicode=true"
            + "&useJDBCCompliantTimezone=true"
            + "&useLeagacyDatetimeCode=false"
            + "&serverTimezone=UTC"
            + "&characterEncoding=utf8";
    
    public static Connection ligacao() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(LIGACAO_BD, "root", "mysql");
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static void insereBola(Connection conexcao, String nome, float preco, String fabricante, String material, int tamanho, String uso, String cor)
    {
        try {
            Statement stmt = conexcao.createStatement();
            stmt.executeUpdate("INSERT INTO `bolas`(`Nome`,`Preco`,`Fabricante`,`Material`,`Tamanho`,`TipoUso`,`Cor`) VALUES" + 
                    "('" + nome + "' , " + preco + ",  '" + fabricante + "', '" + material + "'," + tamanho + ", '" + uso + "', '" + cor + "');");
            conexcao.close();
        } catch (SQLException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Connection c = ligacao();
        insereBola(c, "is_funny", 666.00f, "SEGA", "goma", 7, "a tua cara", "cor da tua mãe");
    }

    public static ResultSet obterBola(Connection ligacao, String id)
    {
        try {
            Statement s = ligacao.createStatement();
            ResultSet bola = s.executeQuery("SELECT * FROM bolas WHERE ID = " + id);
            bola.next();
            return bola;
        } catch (SQLException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Object[][] todasAsBolas(Connection ligacao)
    {
        try {
            ArrayList<Object[]> listaBolas = new ArrayList<Object[]>();
            Statement s = ligacao.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM bolas");
            
            while (rs.next())
            {
                Object[] linha = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                };
                listaBolas.add(linha);
            }
            
           Object[][] grelha = new Object[listaBolas.size()][8];
           listaBolas.toArray(grelha);
           return grelha;
           
        } catch (SQLException ex) {
            Logger.getLogger(FuncoesBaseDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
