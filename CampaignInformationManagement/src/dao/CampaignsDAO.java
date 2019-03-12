/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Campaigns;
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
public class CampaignsDAO {
    final String SQL_CREATE = "INSERT INTO CAMPAIGNS(CAMPAIGNID, TYPEOFCAMPAIGN, STARTDAY, ENDDAY) values(?,?,?,?)";
    final String SQL_READALL = "SELECT * FROM CAMPAIGNS";
    final String SQL_READBYCAMPAIGNID = "SELECT * FROM CAMPAIGNS WHERE CAMPAIGNID = ?";
    final String SQL_UPDATE = "UPDATE CAMPAIGNS SET TYPEOFCAMPAIGN = ?, STARTDAY = ?, ENDDAY = ? WHERE CAMPAIGNID = ? ";
    final String SQL_DELETE = "DELETE FROM CAMPAIGNS WHERE CAMPAIGNID = ?";
    
    Connection con = null;
    Campaigns c = null;
    List<Campaigns> list = null;

    public CampaignsDAO() {
        con = new DBConnector().getCon();
        list = new ArrayList<Campaigns>();
    }
    
    public Campaigns create(Campaigns c){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, c.getCampaignid());
            pr.setString(2, c.getTypeofcampaign());
            pr.setDate(3, new java.sql.Date(c.getStartday().getTime()));
            pr.setDate(4, new java.sql.Date(c.getEndday().getTime()));
            pr.executeUpdate();
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CampaignsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Campaigns> readAll(){
        list = new ArrayList<Campaigns>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(SQL_READALL);
            while(re.next()){
                c = new Campaigns();
                c.setCampaignid(re.getString(1));
                c.setTypeofcampaign(re.getString(2));
                c.setStartday(re.getDate(3));
                c.setEndday(re.getDate(4));
                list.add(c);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CampaignsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Campaigns readByCampaignid(String campaignid){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYCAMPAIGNID);
            pr.setString(1, campaignid);
            ResultSet re = pr.executeQuery();
            while(re.next()){
                return c = new Campaigns(re.getString(1), re.getString(2), re.getDate(3), re.getDate(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampaignsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Campaigns update(Campaigns c){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, c.getTypeofcampaign());
            pr.setDate(2, new java.sql.Date(c.getStartday().getTime()));
            pr.setDate(3, new java.sql.Date(c.getEndday().getTime()));
            pr.setString(4, c.getCampaignid());
            pr.executeUpdate();
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CampaignsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(String campaign){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setString(1, campaign);
            if(pr.executeUpdate() != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampaignsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
