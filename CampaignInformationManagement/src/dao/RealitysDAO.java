/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Realitys;
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
public class RealitysDAO {
    final String SQL_CREATE = "INSERT INTO REALITYS(CAMPAIGNID, SUMQUANTITY, SUMBUDGET) values(?,?,?)";
    final String SQL_READALL = "SELECT * FROM REALITYS";
    final String SQL_READBYID = "SELECT * FROM REALITYS WHERE CAMPAIGNID = ?";
    final String SQL_UPDATE = "UPDATE REALITYS SET SUMQUANTITY = ?, SUMBUDGET = ? WHERE CAMPAIGNID = ? ";
    final String SQL_DELETE = "DELETE FROM REALITYS WHERE CAMPAIGNID = ?";
    
    Connection con = null;
    Realitys r = null;
    List<Realitys> list = null;

    public RealitysDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Realitys>();
    }
    
    public Realitys create(Realitys r){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, r.getCampaignid());
            pr.setInt(2, r.getSumquantity());
            pr.setInt(3, r.getSumbudget());
            pr.executeUpdate();
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(RealitysDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Realitys> readAll(){
        list = new ArrayList<Realitys>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                r = new Realitys();
                r.setCampaignid(re.getString(1));
                r.setSumquantity(re.getInt(2));
                r.setSumbudget(re.getInt(3));
                list.add(r);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RealitysDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Realitys readById(String campaignid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYID);
            pr.setString(1, campaignid);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return r = new Realitys(re.getString(1), re.getInt(2), re.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RealitysDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Realitys update(Realitys r){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setInt(1, r.getSumquantity());
            pr.setInt(2, r.getSumbudget());
            pr.setString(3, r.getCampaignid());
            pr.executeUpdate();
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(RealitysDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RealitysDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
