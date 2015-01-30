/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.beans;

import java.io.Serializable;

/**
 *
 * @author MSLC
 */

public class Order implements Serializable {
private String itemCode;
private String itemName;
private String itemMfd;
private String itemPrice;
private String quantity;
private String status;
private String username;
private String Address;
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemMfd() {
        return itemMfd;
    }

    public void setItemMfd(String itemMfd) {
        this.itemMfd = itemMfd;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

}