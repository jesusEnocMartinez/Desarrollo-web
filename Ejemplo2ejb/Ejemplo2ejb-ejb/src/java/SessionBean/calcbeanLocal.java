/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author enoc
 */
@Local
public interface calcbeanLocal {

    Integer sumar(int a, int b);
    
}
