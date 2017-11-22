package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transuction")
public class Transuction {
	
	@Id
	@GeneratedValue
	@Column(name="idtransuction")
	private Integer id;
	
	@Column(name="")
	private Double deposite;
	
	@Column(name="")
	private Double withdraw;
	
	@Column(name="")
	private Double TotalAmount;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="accountno_t")
	private NewAccount nacc;
	
	
	
	public NewAccount getNacc() {
		return nacc;
	}
	public void setNacc(NewAccount nacc) {
		this.nacc = nacc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getDeposite() {
		return deposite;
	}
	public void setDeposite(Double deposite) {
		this.deposite = deposite;
	}
	public Double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	
	
	

}
