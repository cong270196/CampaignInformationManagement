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
public class Prices implements Serializable{
    private int priceid;
    private int price;
    private Date startday;
    private Date endday;

    public Prices() {
    }

    public Prices(int priceid, int price, Date startday, Date endday) {
        this.priceid = priceid;
        this.price = price;
        this.startday = startday;
        this.endday = endday;
    }

    public int getPriceid() {
        return priceid;
    }

    public void setPriceid(int priceid) {
        this.priceid = priceid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
    
}
