package com.example.ecsite_syokyu_springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_buy_item_transaction")
public class UserBuyItem {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	@Column(name="item_transaction_id")
	private int item_transaction_id;
 
	@Column(name="total_price")
	private int total_price;

	@Column(name="total_count")
	private int total_count;
	
	@Column(name="user_master_id")
	private int user_master_id;

	@Column(name="pay")
	private String pay;

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
	 * @return the item_transaction_id
	 */
	public int getItem_transaction_id() {
		return item_transaction_id;
	}

	/**
	 * @param item_transaction_id the item_transaction_id to set
	 */
	public void setItem_transaction_id(int item_transaction_id) {
		this.item_transaction_id = item_transaction_id;
	}

	/**
	 * @return the total_price
	 */
	public int getTotal_price() {
		return total_price;
	}

	/**
	 * @param total_price the total_price to set
	 */
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	/**
	 * @return the total_count
	 */
	public int getTotal_count() {
		return total_count;
	}

	/**
	 * @param total_count the total_count to set
	 */
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	/**
	 * @return the user_master_id
	 */
	public int getUser_master_id() {
		return user_master_id;
	}

	/**
	 * @param user_master_id the user_master_id to set
	 */
	public void setUser_master_id(int user_master_id) {
		this.user_master_id = user_master_id;
	}

	/**
	 * @return the pay
	 */
	public String getPay() {
		return pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(String pay) {
		this.pay = pay;
	}
}