package org.hamza.model;

/**
 * 
 * @author Hamza
 *
 * Client class
 * 
 */
public class Client {
	private Long id;
	private String name;
	private String cin;
	private String Address;
	private Account account;
	
	/**
	 * Constructors
	 */
	public Client() {}
	
	public Client(String name, String cin, String address) {
		this.id = (long) 1; // to be generated
		this.name = name;
		this.cin = cin;
		this.Address = address;
	}
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", cin=" + cin + ", Address=" + Address + ", account=" + account
				+ "]";
	}

	/**
	 * setters && getters
	 *
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Long getId() {
		return id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
