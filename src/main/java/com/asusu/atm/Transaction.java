package com.asusu.atm;

import javax.persistence.*;
//import java.math.BigDecimal;


@Entity
public class Transaction {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer accountno;
	private long amount;
	private String action;
	private String reason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccountno() {
		return accountno;
	}
	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

	
	

}
