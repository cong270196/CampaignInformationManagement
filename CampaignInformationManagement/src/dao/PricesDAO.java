/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Prices;
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
public class PricesDAO {
    final String SQL_CREATE = "INSERT INTO PRICES(PRICEID, PRICE, STARTDAY, ENDDAY) values(?,?,?,?)";
    final String SQL_READALL = "SELECT * FROM PRICES";
    final String SQL_UPDATE = "UPDATE PRICES SET PRICE = ?, STARTDAY= ?, ENDDAY = ? WHERE PRICEID = ? ";
    final String SQL_DELETE = "DELETE FROM PRICES WHERE PRICEID = ?";
    
    Connection con = null;
    Prices p = null;
    List<Prices> list = null;

    public PricesDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Prices>();
    }
    
    public Prices create(Prices p){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setInt(1, p.getPriceid());
            pr.setInt(2, p.getPrice());
            pr.setDate(3, new java.sql.Date(p.getStartday().getTime()));
            pr.setDate(4, new java.sql.Date(p.getEndday().getTime()));
            pr.executeUpdate();
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Prices> readAll(){
        list = new ArrayList<Prices>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                p = new Prices();
                p.setPriceid(re.getInt(1));
                p.setPrice(re.getInt(2));
                p.setStartday(re.getDate(3));
                p.setEndday(re.getDate(4));
                list.add(p);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Prices update(Prices p){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setInt(1, p.getPrice());
            pr.setDate(2, new java.sql.Date(p.getStartday().getTime()));
            pr.setDate(3, new java.sql.Date(p.getEndday().getTime()));
            pr.setInt(4, p.getPriceid());
            pr.executeUpdate();
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(int priceid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setInt(1, priceid);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
