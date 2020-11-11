/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enoc.uv;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.enoc.uv.BeanpruebaRemote;

/**
 *
 * @author enoc
 */
@WebService(serviceName = "Service")
public class Service {

    @EJB
    private BeanpruebaRemote session;
    
    
    @WebMethod(operationName = "suma")
    public float suma(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        return session.suma(a, b);
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
