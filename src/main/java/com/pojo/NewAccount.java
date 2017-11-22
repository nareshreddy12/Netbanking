package com.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "userdetails")
public class NewAccount {

	@Id
	@GeneratedValue
	@Column(name = "id_account")
	private Integer Accountno;

	@Column(name = "")
	private String username;

	@Column(name = "")
	private String password;

	@Transient
	private String repassword;

	@Column(name = "")
	private double amount;

	@Column(name = "address")
	private String address;

	@Column(name = "")
	private String phone;

	@Column(name = "")
	private String role;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountno_t")
	private List<Transuction> tr;

	

	public List<Transuction> getTr() {
		return tr;
	}

	public void setTr(List<Transuction> tr) {
		this.tr = tr;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getAccountno() {
		return Accountno;
	}

	public void setAccountno(Integer accountno) {
		Accountno = accountno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
