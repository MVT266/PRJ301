/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class loginDBcontext extends DBContext<Account>{
    public Account getAccountByUsernamePassword(String username, String password) {
        try {
            String sql = "SELECT * FROM [FAP_Database].[dbo].[Account]\n"
                    + "WHERE Username = ? AND Password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                Account r = new Account();
                r.setUsername(rs.getString("username"));
                
                return r;
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public String getCode(String user_name, String password) {
        try {
            String sql = "SELECT account_id FROM [FAP_Database].[dbo].[Account]\n"
                    + "WHERE username = ? AND pass = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user_name);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
         
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
    @Override
    public ArrayList<Account> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
