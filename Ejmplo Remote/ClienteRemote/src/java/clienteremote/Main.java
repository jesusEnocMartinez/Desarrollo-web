/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteremote;

import UV.eno.com.NewSessionBeanRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author enoc
 */
public class Main {

    @EJB
    private static NewSessionBeanRemote newSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(newSessionBean.sumar(0,0) );

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("Programa que suma dos numeros");
        System.out.println("**********************");

        System.out.println("Ingresa numero a:");
        Double a = sc.nextDouble();
        System.out.println("Ingresa numero b");
        Double b = sc.nextDouble();

        System.out.println("La suma es **********************" + newSessionBean.sumar(a, b));

    }

}
