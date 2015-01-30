/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.beans;



/**
 *
 * @author MSLC
 */

public class Display{
private String itemCode="Item Code";
private String itemName="Item Name";
private String itemPrice="Item Price";
private String itemMfd="Item MFD";
private String Quantity="Quantity";
private String Status="Stauus";

	
    public String getitemCode() {
        return itemCode;
    }

    public void setitemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getitemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    public String getitemPrice() {
        return itemPrice;
    }

    public void setitemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getitemMfd() {
        return itemMfd;
    }

    public void setitemMfd(String itemMfd) {
        this.itemMfd = itemMfd;
    }

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String Quantity) {
		this.Quantity = Quantity;
	}
	public void setStatus(String Status){
		this.Status=Status;
	}
	public String getStatus(){
		return Status;
	}
    
}