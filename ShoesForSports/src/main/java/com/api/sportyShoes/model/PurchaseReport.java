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
	
	

	public PurchaseReport() {
		super();
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
