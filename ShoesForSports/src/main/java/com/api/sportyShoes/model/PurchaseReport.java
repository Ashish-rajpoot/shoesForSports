package com.api.sportyShoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
@ApiModel(value ="Purchase Report Bean")
public class PurchaseReport {
	
	

	public PurchaseReport(int id, String purchasedBy, String category, Date dop, String orderList) {
		super();
		this.id = id;
		this.purchasedBy = purchasedBy;
		this.category = category;
		this.dop = dop;
		this.orderList = orderList;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPurchasedBy() {
		return purchasedBy;
	}



	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public Date getDop() {
		return dop;
	}



	public void setDop(Date dop) {
		this.dop = dop;
	}



	public String getOrderList() {
		return orderList;
	}



	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}



	public PurchaseReport() {
		super();
	}



	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy; 
	private String category;
	
	@Temporal(TemporalType.DATE)
	private Date dop;

	
	String orderList;
	
}
