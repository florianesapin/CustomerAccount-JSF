package ch.hearc.ig.odi.customeraccountjsf.business;

import java.util.*;

public class Customer {

	private Map<String, Account> accounts;  //--converti en Map, VP=> Collection<Account> accounts;
	private int number;


	/**
	 * 
	 * @param number
	 */
	public Customer(Integer number) {
            this.number = number;

            this.accounts = new HashMap();
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
            return this.accounts.get(number);
		
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(Account account) {
	
            accounts.put(account.getNumber(), account);
            
	}

        public Map<String, Account> getAccounts() {
            return accounts;
        }

        public void setAccounts(Map<String, Account> accounts) {
            this.accounts = accounts;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

 

}
