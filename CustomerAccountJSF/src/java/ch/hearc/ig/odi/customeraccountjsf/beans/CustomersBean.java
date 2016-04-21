/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.beans;

import ch.hearc.ig.odi.customeraccountjsf.services.Services;
import ch.hearc.ig.odi.customeraccountjsf.business.Customer;
import ch.hearc.ig.odi.customeraccountjsf.business.Individual;
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

@Named(value = "customersBean")
//@Dependent
@SessionScoped


public class CustomersBean implements Serializable{
    
    @Inject Services services;
    private DataModel<Customer> lesClients;
    
   
    /**
     * Creates a new instance of CustomersBean
     */
    public CustomersBean() {
    }
    
    public DataModel<Customer> getLesClients(){
        lesClients = new ListDataModel<Customer>();


        //doit retourner une liste
        lesClients.setWrappedData(services.getCustomersList());

        return lesClients;
    }
    
    
}
