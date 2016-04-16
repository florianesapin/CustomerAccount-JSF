/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.beans;

import ch.hearc.ig.odi.customeraccountjsf.services.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "customerCreateBean")
//@Dependent
@SessionScoped
 
public class CustomerCreateBean implements Serializable{
    
    @Inject Services services;
    private Integer number = null;
    private String lastName = null;
    private String firstName = null;
    

    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean(){
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String save(){
        String result;
        services.saveCustomer(number, firstName, lastName);
        result = "Success";
        return result; 
    }
    
    
}
