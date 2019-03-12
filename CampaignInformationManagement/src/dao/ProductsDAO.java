/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Products;
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
public class ProductsDAO {
    final String SQL_CREATE = "INSERT INTO PRODUCTS(PRODUCTID, PRODUCTNAME, DESCRIPTION) values(?,?,?)";
    final String SQL_READALL = "SELECT * FROM PRODUCTS";
    final String SQL_READBYPRODUCTID = "SELECT * FROM PRODUCTS WHERE PRODUCTID = ?";
    final String SQL_UPDATE = "UPDATE PRODUCTS SET PRODUCTNAME = ?, DESCRIPTION = ? WHERE PRODUCTID = ? ";
    final String SQL_DELETE = "DELETE FROM PRODUCTS WHERE PRODUCTID = ?";
    
    Connection con = null;
    Products p = null;
    List<Products> list = null;

    public ProductsDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Products>();
    }
    
    public Products create(Products p){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, p.getProductid());
            pr.setString(2, p.getProductname());
            pr.setString(3, p.getDescription());
            pr.executeUpdate();
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<Products> readAll(){
        list = new ArrayList<Products>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                p = new Products();
                p.setProductid(re.getString(1));
                p.setProductname(re.getString(2));
                p.setDescription(re.getString(3));
                list.add(p);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Products readByProductid(String productid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYPRODUCTID);
            pr.setString(1, productid);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return p = new Products(re.getString(1), re.getString(2), re.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Products update(Products p){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, p.getProductname());
            pr.setString(2, p.getDescription());
            pr.setString(3, p.getProductid());
            pr.executeUpdate();
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(String productid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setString(1, productid);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
