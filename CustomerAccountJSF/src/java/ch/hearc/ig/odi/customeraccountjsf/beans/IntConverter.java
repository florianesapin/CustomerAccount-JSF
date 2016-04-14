/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.beans;

import ch.hearc.ig.odi.customeraccountjsf.business.Customer;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "intConverter")
@Dependent
public class IntConverter implements Converter{

    /**
     * Creates a new instance of IntConverter
     */
    public IntConverter() {
    }
    
    @PersistenceContext
    private transient EntityManager em;

    @Override
    public Integer getAsObject(FacesContext context, UIComponent component, String value) {
        return Integer.parseInt(value);
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {

        return String.valueOf(value);

    }


    
}






