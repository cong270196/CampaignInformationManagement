/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Exchanges;
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
public class ExchangesDAO {
    final String SQL_CREATE = "INSERT INTO EXCHANGES(CAMPAIGNID, SALEDAY, QUANTITY) values(?,?,?)";
    final String SQL_READALL = "SELECT * FROM EXCHANGES";
    final String SQL_UPDATE = "UPDATE EXCHANGES SET SALEDAY = ?, QUANTITY = ? WHERE CAMPAIGNID = ? ";
    final String SQL_DELETE = "DELETE FROM EXCHANGES WHERE CAMPAIGNID = ?";
    
    Connection con = null;
    Exchanges e = null;
    List<Exchanges> list = null;

    public ExchangesDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Exchanges>();
    }
    
    public Exchanges create(Exchanges e){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, e.getCampaignid());
            pr.setDate(2, new java.sql.Date(e.getSaleday().getTime()));
            pr.setInt(3, e.getQuantity());
            pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(ExchangesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Exchanges> readAll(){
        list = new ArrayList<Exchanges>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                e = new Exchanges();
                e.setCampaignid(re.getString(1));
                e.setSaleday(re.getDate(2));
                e.setQuantity(re.getInt(3));
                list.add(e);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ExchangesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Exchanges update(Exchanges e){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setDate(1, new java.sql.Date(e.getSaleday().getTime()));
            pr.setInt(2, e.getQuantity());
            pr.setString(3, e.getCampaignid());
            pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(ExchangesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(String campaignid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setString(1, campaignid);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExchangesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
