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
public class Products_Prices implements Serializable{
    private int id;
    private String productid;
    private int priceid;

    public Products_Prices() {
    }

    public Products_Prices(int id, String productid, int priceid) {
        this.id = id;
        this.productid = productid;
        this.priceid = priceid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public int getPriceid() {
        return priceid;
    }

    public void setPriceid(int priceid) {
        this.priceid = priceid;
    }
    
}
