/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enoc.uv;

import javax.ejb.Remote;

/**
 *
 * @author enoc
 */
@Remote
public interface Interface {
     public Integer suma(Integer x, Integer y);
}
