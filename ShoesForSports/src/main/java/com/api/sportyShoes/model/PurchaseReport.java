package com.api.sportyShoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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



	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy; 
	private String category;
	
	@Temporal(TemporalType.DATE)
	private Date dop;

	
	String orderList;
	
}