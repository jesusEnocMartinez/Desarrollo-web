/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UV.eno.com;

import javax.ejb.Stateless;

/**
 *
 * @author enoc
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public double sumar(double a, double b) {
        return (a+b);
    }

    
}
