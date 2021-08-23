package org.hamza.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 
 * @author Hamza
 *
 * Class that represent a bank
 * 
 */
public class Bank {
	private Long id;
	private String name;
	private List<Account> accounts;
	
	/**
	 * Constructors
	 */
	
	public Bank() {
		this.id = (long) 111;
		this.name = "test";
		this.accounts = new ArrayList<Account>();
	}
	
    public Bank(String name, List<Account> accounts) {
		this.id = (long) 112; // to be generated
		this.name = name;
		this.accounts = accounts;
	}
    
    
    /**
     * Add account to acounts list
     * @param acc
     */
	public void addAccount(Account acc) {
		accounts.add(acc);
	}

	/**
	 * Method to create an account
	 * @param client
	 * @param balance
	 * @return an account
	 */
	public Account openAccount(Client client, double balance) {
        try {
        	Account acc = new SavingsAccount();
            acc.setClient(client);
            acc.deposit(balance);
            addAccount(acc);
            client.setAccount(acc);
            return acc;
        } catch (Exception e) {
			// TODO: handle exception
        	return null;
		}
    }

    /**
     * Method to search an account by client name
     * @param acn
     * @return a list of accounts
     */
	public List<Account> search(String acn) {
        List<Account> acc = (List<Account>) accounts.stream().filter(a -> a.client.getName() == acn).collect(Collectors.toList());
        return acc;
	}

    /**
     * getters && setters
     * 
     */
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Long getId() {
		return id;
	}
    
    
}
