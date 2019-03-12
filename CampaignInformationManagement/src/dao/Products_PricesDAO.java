/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Products_Prices;
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
public class Products_PricesDAO {
    final String SQL_CREATE = "INSERT INTO PRODUCTS_PRICES(ID, PRODUCTID, PRICEID) values(?,?,?)";
    final String SQL_READALL = "SELECT * FROM PRODUCTS_PRICES";
    final String SQL_UPDATE = "UPDATE PRODUCTS_PRICES SET PRODUCTID = ?, PRICEID = ? WHERE ID = ? ";
    final String SQL_DELETE = "DELETE FROM PRODUCTS_PRICES WHERE ID = ?";
    
    Connection con = null;
    Products_Prices pp = null;
    List<Products_Prices> list = null;

    public Products_PricesDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Products_Prices>();
    }
    
    public Products_Prices create(Products_Prices pp){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setInt(1, pp.getId());
            pr.setString(2, pp.getProductid());
            pr.setInt(3, pp.getPriceid());
            pr.executeUpdate();
            return pp;
        } catch (SQLException ex) {
            Logger.getLogger(Products_PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Products_Prices> readAll(){
        list = new ArrayList<Products_Prices>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                pp = new Products_Prices();
                pp.setId(re.getInt(1));
                pp.setProductid(re.getString(2));
                pp.setPriceid(re.getInt(3));
                list.add(pp);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Products_PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Products_Prices update(Products_Prices pp){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, pp.getProductid());
            pr.setInt(2, pp.getPriceid());
            pr.setInt(3, pp.getId());
            pr.executeUpdate();
            return pp;
        } catch (SQLException ex) {
            Logger.getLogger(Products_PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(int id){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setInt(1, id);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Products_PricesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
