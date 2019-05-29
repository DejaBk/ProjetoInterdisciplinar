/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Model_Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author deja
 */
public class Dao_Usuario {
    PreparedStatement pst;
    String sql;
    
    /**
     *
     * @param login_usu
     * @param senha_usu
     * @return
     * @throws SQLException
     */
    public boolean login (String login_usu, String senha_usu) throws SQLException{
        
        boolean checar = false;
        
        try {
            Model_Usuario usr = null;
            sql = "SELECT * FROM tbusuarios WHERE loginusu = ? and senhausu = ?";
            Statement st;
            //pst = Conexao.getInstance().prepareStatement(sql);
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setString(1, login_usu); 
            pst.setString(2, senha_usu);
            pst.executeQuery();
            ResultSet rs = pst.getResultSet();
            
            
            
            
           if (rs.next())
           {
                checar = true;
                 
            }
            
            
            return checar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            e.printStackTrace();
        }
        pst.close();
       return checar;
    }
}
