/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnector;

/**
 *
 * @author USER
 */
public class UsersDAO {
    final String SQL_CREATE = "INSERT INTO USERS(USERID, USERNAME, PASSWORD, ROLEID) VALUES (?,?,?,?)";
    final String SQL_READALL = "SELECT * FROM USERS";
    final String SQL_READBYUSERID = "SELECT * FROM USERS WHERE USERID = ?";
    final String SQL_READBYUSERNAME = "SELECT * FROM USERS WHERE USERNAME = ?";
    final String SQL_READBYROLEID = "SELECT * FROM USERS WHERE ROLEID = ?";
    final String SQL_UPDATE = "UPDATE USERS SET USERNAME = ?, PASSWORD = ?, ROLEID = ? WHERE USERID = ? ";
    final String SQL_DELETE = "DELETE FROM USERS WHERE USERID = ?";
    
    Connection con = null;
    Users u = null;
    List<Users> list = null;

    public UsersDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Users>();
    }
    
    public Users create(Users u){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, u.getUserid());
            pr.setString(2, u.getUsername());
            pr.setString(3, u.getPassword());
            pr.setInt(4, u.getRoleid());
            pr.executeUpdate();
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Users> readAll(){
        list = new ArrayList<Users>();
        try {
            Statement st  = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                u = new Users();
                u.setUserid(re.getString(1));
                u.setUsername(re.getString(2));
                u.setPassword(re.getString(3));
                u.setRoleid(re.getInt(4));
                list.add(u);  
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Users readByUserid(String userid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYUSERID);
            pr.setString(1, userid);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return u = new Users(re.getString(1), re.getString(2), re.getString(3), re.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Users readByUsername(String username){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYUSERNAME);
            pr.setString(1, username);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return u = new Users(re.getString(1), re.getString(2), re.getString(3), re.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Users readByRoleid(int roleid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYROLEID);
            pr.setInt(1, roleid);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return u = new Users(re.getString(1), re.getString(2), re.getString(3), re.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Users update(Users u){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, u.getUsername());
            pr.setString(2, u.getPassword());
            pr.setInt(3, u.getRoleid());
            pr.setString(4, u.getUserid());
            pr.executeUpdate();
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(String userid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setString(1, userid);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
