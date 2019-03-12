/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Estimates;
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
public class EstimatesDAO {
    final String SQL_CREATE = "INSERT INTO ESTIMATES(CAMPAIGNID, BUDGET, TARGET, VARIANCEALLOWED) values(?,?,?,?)";
    final String SQL_READALL = "SELECT * FROM ESTIMATES";
    final String SQL_UPDATE = "UPDATE ESTIMATES SET BUDGET = ?, TARGET = ?, VARIANCEALLOWED = ? WHERE CAMPAIGNID = ? ";
    final String SQL_DELETE = "DELETE FROM ESTIMATES WHERE CAMPAIGNID = ?";
    
    Connection con = null;
    Estimates e = null;
    List<Estimates> list = null;

    public EstimatesDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Estimates>();
    }
    
    public Estimates create(Estimates e){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, e.getCampaignid());
            pr.setInt(2, e.getBudget());
            pr.setInt(3, e.getTarget());
            pr.setInt(4, e.getVarianceallowed());
            pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EstimatesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Estimates> readAll(){
        list = new ArrayList<Estimates>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                e = new Estimates();
                e.setCampaignid(re.getString(1));
                e.setBudget(re.getInt(2));
                e.setTarget(re.getInt(3));
                e.setVarianceallowed(re.getInt(4));
                list.add(e);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(EstimatesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Estimates update(Estimates e){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setInt(1, e.getBudget());
            pr.setInt(2, e.getTarget());
            pr.setInt(3, e.getVarianceallowed());
            pr.setString(4, e.getCampaignid());
            pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EstimatesDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EstimatesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
