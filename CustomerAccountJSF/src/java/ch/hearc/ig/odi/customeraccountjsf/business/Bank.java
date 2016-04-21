/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author floriane.sapin
 */
@RequestScoped
public class Bank {

    private Integer number;
    private String name;
    private Map<String, Account> accounts;
    private Map<Integer, Customer> customers;

    public Bank(Integer number, String name) {
        this.number = number;
        this.name = name;
        accounts = new HashMap<String, Account>();
        customers = new HashMap<Integer, Customer>();
    }

    public Account getAccountByNumber(String number) {
        Account accoundFind;

        accoundFind = this.accounts.get(number);

        if (accoundFind == null) {
            throw new IllegalArgumentException("Le compte n°" + number + "n''existe pas");
        }

        return accoundFind;
    }

    public Customer getCustomerByNumber(Integer number) {
        Customer customerFind;

        customerFind = this.customers.get(number);

        if (customerFind == null) {
            throw new IllegalArgumentException("Le client n°" + number + "n''existe pas");
        }

        return customerFind;

    }
    
    public Map<Integer, Customer> getCustomers(){
        return this.customers;
    }

    public void addAccount(String number, String name, Double rate, Customer customer) {
        Account account = new Account(number, name, rate, customer);
        accounts.put(name, account);
        customer.addAccount(account);

    }
    
    public void addIndividual(Integer number, String firstName, String lastName, Date birthday, String email){
       Individual individual = new Individual(number, firstName, lastName, birthday, email);
       customers.put(number, individual);
    }
    
    public Customer addCustomer(Integer number, String firstName, String lastName){
       Individual individual = new Individual(number, firstName, lastName);
       customers.put(number, individual);
       return individual;
    }
    

}
