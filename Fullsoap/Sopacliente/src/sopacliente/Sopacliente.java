/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopacliente;

import javax.swing.JOptionPane;
import org.enoc.uv.Service;
import org.enoc.uv.Service_Service;

/**
 *
 * @author enoc
 */
public class Sopacliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a = Float.parseFloat(getInput("Ingresa un numero"));
        float b = Float.parseFloat(getInput("Ingresa otro numero:"));
       
        float resultado = 0f;
        //mx.uv.wr
        org.enoc.uv.Service_Service  servicio = new Service_Service();
      
        org.enoc.uv.Service s = servicio.getServicePort();
        resultado = s.suma(a, b);
        showMessage("El resultado es " + a + " + " + b + " es: " +  resultado);
    }
  
    public static String getInput(String message) {
        return JOptionPane.showInputDialog(message);
    }
   
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    }
    

