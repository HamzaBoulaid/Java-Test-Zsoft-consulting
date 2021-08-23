package org.hamza.model;

import java.util.Date;

/**
 * 
 * @author Hamza
 *
 * Class that represent an operation
 * 
 */
public class Operation {

	private Long id;
	private String type;
	private Date date;
	private Account account;
	private Double amount;
	private Double balance;
	
	/**
	 * Constructors
	 */
	public Operation() {
		id = (long) 159; // to be generated
	};
	
	public Operation(String type, Date date, Account account, Double amount, Double balance) {
		super();
		this.id = (long) 159; // to be generated
		this.type = type;
		this.date = date;
		this.account = account;
		this.amount = amount;
		this.balance = balance;
	}
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
		return "Operation [type=" + type + ", date=" + date + ", account=" + account.getId() + ", amount=" + amount
				+ ", balance=" + balance + "]";
	}

	/**
	 * getters && setters
	 * 
	 */

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}
	
	
}
