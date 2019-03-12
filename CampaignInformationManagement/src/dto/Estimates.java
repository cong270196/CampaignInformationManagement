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
public class Estimates implements Serializable{
    private String campaignid;
    private int budget;
    private int target;
    private int varianceallowed;

    public Estimates() {
    }

    public Estimates(String campaignid, int budget, int target, int varianceallowed) {
        this.campaignid = campaignid;
        this.budget = budget;
        this.target = target;
        this.varianceallowed = varianceallowed;
    }

    public String getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(String campaignid) {
        this.campaignid = campaignid;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getVarianceallowed() {
        return varianceallowed;
    }

    public void setVarianceallowed(int varianceallowed) {
        this.varianceallowed = varianceallowed;
    }
    
}
