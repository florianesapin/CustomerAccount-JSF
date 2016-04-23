/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccountjsf.beans;

import javax.el.ValueExpression;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author floriane.sapin
 */
@FacesValidator("ValidFields")
public class ValidFields implements Validator{

    @Override
    public void validate(FacesContext context,UIComponent component, Object value) throws ValidatorException {
        String prenom = (String) value;
        if ( prenom.equals("")){
            FacesMessage msgErr =
            new FacesMessage("validation failed","Champ prénom obligatoire");
         msgErr.setSeverity(FacesMessage.SEVERITY_ERROR);
         throw new ValidatorException(msgErr);
        }
        
    }
    
    
   
}
