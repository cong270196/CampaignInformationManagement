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
public class Campaigns implements Serializable{
    private String campaignid;
    private String typeofcampaign;
    private Date startday;
    private Date endday;

    public Campaigns() {
    }

    public Campaigns(String campaignid, String typeofcampaign, Date startday, Date endday) {
        this.campaignid = campaignid;
        this.typeofcampaign = typeofcampaign;
        this.startday = startday;
        this.endday = endday;
    }

    public String getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(String campaignid) {
        this.campaignid = campaignid;
    }

    public String getTypeofcampaign() {
        return typeofcampaign;
    }

    public void setTypeofcampaign(String typeofcampaign) {
        this.typeofcampaign = typeofcampaign;
    }

    public Date getStartday() {
        return startday;
    }

    public void setStartday(Date startday) {
        this.startday = startday;
    }

    public Date getEndday() {
        return endday;
    }

    public void setEndday(Date endday) {
        this.endday = endday;
    }

    @Override
    public String toString() {
        return this.getCampaignid();
    }
    
}
