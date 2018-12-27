package com.example.ecsite_syokyu_springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_info_transaction")
public class BuyItem {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	@Column(name="itemName")
	private String itemName;
 
	@Column(name="itemPrice")
	private int itemPrice;

	@Column(name="itemStock")
	private int itemStock;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemPrice
	 */
	public int getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * @return the itemStock
	 */
	public int getItemStock() {
		return itemStock;
	}

	/**
	 * @param itemStock the itemStock to set
	 */
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
}