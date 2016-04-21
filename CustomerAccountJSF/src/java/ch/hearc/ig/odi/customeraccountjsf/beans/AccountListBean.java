/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.beans;

import ch.hearc.ig.odi.customeraccountjsf.business.Account;
import ch.hearc.ig.odi.customeraccountjsf.business.Customer;
import ch.hearc.ig.odi.customeraccountjsf.business.Individual;
import ch.hearc.ig.odi.customeraccountjsf.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "accountListBean")
//@Dependent
@SessionScoped


public class AccountListBean implements Serializable{

    /**
     * Creates a new instance of AccountListBean
     */
    
    @Inject Services services;
    private Customer cli;
    private DataModel<Account> lesComptes;
    
    
    
    
    public AccountListBean() {
    }
    
    public String recupClient(Customer customer){
        this.cli = customer;
        return "Success";
    }

    public Customer getCli() {
        return cli;
    }

    public void setCli(Customer cli) {
        this.cli = cli;
    }
    
    public DataModel<Account> getLesComptes(){
        
        lesComptes = new ListDataModel<Account>();

        //doit retourner une liste
        lesComptes.setWrappedData(services.getAccountListByCli(cli.getNumber()));

        return lesComptes;
    }


    
}
