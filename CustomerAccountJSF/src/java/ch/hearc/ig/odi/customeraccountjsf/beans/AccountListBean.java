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
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "accountListBean")
@Dependent
public class AccountListBean {

    /**
     * Creates a new instance of AccountListBean
     */
    
    @Inject Services services;
    private DataModel<Account> lesComptes;
    
    
    public AccountListBean() {
    }
    
    
    public DataModel<Account> getLesComptes(Integer id){
        lesComptes = new ListDataModel<Account>();


        //doit retourner une liste
        //lesComptes.setWrappedData(services.);

        return lesComptes;
    }
    
}
