/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//GABRIELA MARIA SINASTRE & MAYKON DOUGLAS BORGES
package system_model;

import system.IU.IUBemVindo;

/**
 *
 * @author maayk
 */
public class Trabalho_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBemVindo().setVisible(true);
            }
        });
    }

}
