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
public class Realitys implements Serializable{
    private String campaignid;
    private int sumquantity;
    private int sumbudget;

    public Realitys() {
    }

    public Realitys(String campaignid, int sumquantity, int sumbudget) {
        this.campaignid = campaignid;
        this.sumquantity = sumquantity;
        this.sumbudget = sumbudget;
    }

    public String getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(String campaignid) {
        this.campaignid = campaignid;
    }

    public int getSumquantity() {
        return sumquantity;
    }

    public void setSumquantity(int sumquantity) {
        this.sumquantity = sumquantity;
    }

    public int getSumbudget() {
        return sumbudget;
    }

    public void setSumbudget(int sumbudget) {
        this.sumbudget = sumbudget;
    }
}
