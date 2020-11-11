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
public interface BeanpruebaRemote {
    
    float suma (float a, float b);
}
