/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Managecams implements Serializable{
    private int manageid;
    private String userid;
    private String campaignid;
    private String productid;

    public Managecams() {
    }

    public Managecams(int manageid, String userid, String campaignid, String productid) {
        this.manageid = manageid;
        this.userid = userid;
        this.campaignid = campaignid;
        this.productid = productid;
    }

    public int getManageid() {
        return manageid;
    }

    public void setManageid(int manageid) {
        this.manageid = manageid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(String campaignid) {
        this.campaignid = campaignid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }
    
}
