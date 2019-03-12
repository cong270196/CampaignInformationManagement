/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Managecams;
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
public class ManagecamsDAO {
    final String SQL_CREATE = "INSERT INTO MANAGECAMS(MANAGEID, USERID, CAMPAIGNID, PRODUCTID) values(?,?,?,?)";
    final String SQL_READALL = "SELECT * FROM MANAGECAMS";
    final String SQL_UPDATE = "UPDATE MANAGECAMS SET USERID = ?, CAMPAIGNID = ?, PRODUCTID = ? WHERE MANAGEID = ? ";
    final String SQL_DELETE = "DELETE FROM MANAGECAMS WHERE MANAGEID = ?";
    
    Connection con = null;
    Managecams m = null;
    List<Managecams> list = null;

    public ManagecamsDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Managecams>();
    }
    
    public Managecams create(Managecams m){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setInt(1, m.getManageid());
            pr.setString(2, m.getUserid());
            pr.setString(3, m.getCampaignid());
            pr.setString(4, m.getProductid());
            pr.executeUpdate();
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(ManagecamsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Managecams> readAll(){
        list = new ArrayList<Managecams>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                m = new Managecams();
                m.setManageid(re.getInt(1));
                m.setUserid(re.getString(2));
                m.setCampaignid(re.getString(3));
                m.setProductid(re.getString(4));
                list.add(m);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ManagecamsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Managecams update(Managecams m){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, m.getUserid());
            pr.setString(2, m.getCampaignid());
            pr.setString(3, m.getProductid());
            pr.setInt(4, m.getManageid());
            pr.executeUpdate();
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(ManagecamsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(int manageid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setInt(1, manageid);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagecamsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
