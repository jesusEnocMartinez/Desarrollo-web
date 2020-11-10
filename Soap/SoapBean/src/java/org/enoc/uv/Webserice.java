/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enoc.uv;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author enoc
 */
@WebService(serviceName = "Webserice")
public class Webserice {

    @EJB
    private Interface ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "x") Integer x, @WebParam(name = "y") Integer y) {
        return ejbRef.suma(x, y);
    }
    
}
