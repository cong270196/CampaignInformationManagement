/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Exchanges implements Serializable{
    private String campaignid;
    private Date saleday;
    private int quantity;

    public Exchanges() {
    }

    public Exchanges(String campaignid, Date saleday, int quantity) {
        this.campaignid = campaignid;
        this.saleday = saleday;
        this.quantity = quantity;
    }

    public String getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(String campaignid) {
        this.campaignid = campaignid;
    }

    public Date getSaleday() {
        return saleday;
    }

    public void setSaleday(Date saleday) {
        this.saleday = saleday;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
