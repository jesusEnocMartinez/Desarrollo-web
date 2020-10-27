/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UV.eno.com;

import javax.ejb.Remote;

/**
 *
 * @author enoc
 */
@Remote
public interface NewSessionBeanRemote {
    
    double sumar (double a, double b);
}
