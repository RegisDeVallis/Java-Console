/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.javaconsole.*;


public class test {
    
     public static void main(String[] args) throws InterruptedException {
         
        javaconsole.gui(300, 300);
         
        System.out.println("Hello!");
        
        javaconsole.scan();
        
        System.out.println(jconsolevar.usrAnswer);
     }
    
}
