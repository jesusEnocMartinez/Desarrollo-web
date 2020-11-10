/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enoc.uv;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author enoc
 */
@Stateless(name = "Operations")
public class SumaBean implements Interface{

    @Resource
    private SessionContext context;

    @Override
    public Integer suma(Integer x, Integer y) {
        return x + y;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
