/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesoap;

/**
 *
 * @author enoc
 */
public class Clientesoap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        org.enoc.uv.Webserice_Service wdls = new org.enoc.uv.Webserice_Service();
        org.enoc.uv.Webserice port = wdls.getWebsericePort();
        int resul = port.suma(10, 12);
        
        System.out.println("Resultado es " + resul);
    }
    
}
