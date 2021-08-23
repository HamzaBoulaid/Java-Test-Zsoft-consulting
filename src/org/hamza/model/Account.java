package org.hamza.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Hamza
 *
 * Class that represent an account
 * 
 */
public abstract class Account {

	protected Long id;
	protected double balance;
	protected double interest;
	protected Client client;
	protected List<Operation> operationsHistory;
	
	/**
	 * Constructors
	 */
	public Account()
	{
		id = (long) 123; // to be generated
		balance = 0;
		interest = 0;
		operationsHistory = new ArrayList<Operation>();
	}
	
	/**
	 * Deposit money to account
	 * @param amount
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
		operationsHistory.add(new Operation("deposit", new Date(), this, amount, balance));
	}

	/**
	 * Withdraw money from account 
	 * @param amount
	 * @return Error || success
	 */
	public Object withdraw(double amount)
	{
		if (balance - amount < 0) {
			return new Error("withdraw", "not enough money");
		}
		balance = balance - amount;
		operationsHistory.add(new Operation("withdraw", new Date(), this, amount, balance));
		return true;
	}

	/**
	 * Add interest
	 */
	public void addInterest()
	{
		Double amount = balance * interest;
		balance = balance + amount;
		operationsHistory.add(new Operation("addInterest", new Date(), this, amount, balance));
	}
	
	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", interest=" + interest + ", client=" + client + "]";
	}
	
	/**
	 * getters && setters
	 * 
	 */

	public double getBalance()
	{
		return balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public List<Operation> getOperationsHistory() {
		return operationsHistory;
	}
	
}
