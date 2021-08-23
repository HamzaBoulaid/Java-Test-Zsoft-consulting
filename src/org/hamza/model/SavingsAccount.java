package org.hamza.model;

/**
 * 
 * @author Hamza
 *
 * Class that represent a Savings account
 * 
 */
public class SavingsAccount extends Account{

	/**
	 * Constructors
	 */
	public SavingsAccount() {}
	
	public SavingsAccount(double initialBalance, double initialInterest)
	{
		super();
		balance = initialBalance;
		interest = initialInterest;
	}

}
