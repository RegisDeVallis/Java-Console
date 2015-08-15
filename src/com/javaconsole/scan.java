/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaconsole;




/**
 *
 * @author dalen
 */
public class scan {
    
    
    
    public static void scan() throws InterruptedException  {
		
		jconsolevar.usrAnswer = (" ");
                
                jconsolevar.ifAnswer = false;
                
                scanCheck();
                
                
                
	}
        
        public static void scanCheck() throws InterruptedException {
                
                    
                if (jconsolevar.ifAnswer == true) {
                    
                    command.checkcommand();
                    
                }
                else {
                    Thread.sleep(10);
                    scanCheck();
                    
                }
                
            }
    
}
