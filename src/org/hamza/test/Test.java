package org.hamza.test;

import org.hamza.model.Account;
import org.hamza.model.Bank;
import org.hamza.model.Client;
import org.hamza.model.Operation;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Client client = new Client("test", "125845", "test 12 test");

		Account acc = bank.openAccount(client, 1000);
		
		/** User story 1
		* 	In order to save money
		*	As a bank client
		*	I want to make a deposit in my account
		*/
		
		client.getAccount().deposit(200);
		
		
		/** User story 2
		* 	In order to retrieve some or all of my savings
		*	As a bank client
		*	I want to make a withdrawal from my account
		*/

		client.getAccount().withdraw(800);
		
		/** User story 1
		* 	In order to check my operations
		*	As a bank client
		*	I want to see the history (operation, date, amount, balance) of my operations
		*/
		
		System.out.println("My operations : ");
		for (Operation op : client.getAccount().getOperationsHistory()) {
			System.out.println(op.toString());
		}
	}

}
