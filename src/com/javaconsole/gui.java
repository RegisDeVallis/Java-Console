/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaconsole;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultCaret;

import com.javaconsole.javaconsole;
import static com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close;
import java.awt.event.WindowEvent;

/**
 *
 * @author dalen
 */
public class gui  {
    
    public static void gui(int x, int y){
        
        JFrame frame = new JFrame("Console");
        JLabel title = new JLabel("Console");
        JTextArea console = new JTextArea();
        JTextField usrInput = new JTextField();
        JButton enter = new JButton("Enter");
        
        JScrollPane scroll = new JScrollPane(console);
        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        
        com.javaconsole.TextAreaOutputStream taos = com.javaconsole.TextAreaOutputStream.getInstance(console);
        
        frame.add(outerPanel);
        
        outerPanel.add(topPanel, BorderLayout.PAGE_START);
        outerPanel.add(mainPanel, BorderLayout.CENTER);
        outerPanel.add(bottomPanel, BorderLayout.PAGE_END);
        
        topPanel.add(title, BorderLayout.BEFORE_LINE_BEGINS);
        topPanel.setSize(600, 25);
        
        
        mainPanel.add(scroll, BorderLayout.CENTER);
        scroll.setSize(400, 400);
        
        bottomPanel.add(usrInput, BorderLayout.CENTER);
        bottomPanel.add(enter, BorderLayout.AFTER_LINE_ENDS);
        usrInput.setSize(350, 25);
        frame.getRootPane().setDefaultButton(enter);
        
         
        
        frame.pack();
        frame.setSize(x, y);
        console.setEditable(false);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.show();
        
        DefaultCaret autoscroll = (DefaultCaret)console.getCaret();
        autoscroll.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        
        
        enter.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent arg0) {
                
                
                String printUsrInput = usrInput.getText();
                
                jconsolevar.usrAnswer = printUsrInput;
                System.out.println(jconsolevar.usrAnswer);
                jconsolevar.ifAnswer = true;
                
                usrInput.setText("");
                
                if(jconsolevar.consoleClose == true) {
                    
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                    
                    jconsolevar.consoleClose = false;
                }
                
                
                
                
            }
        });
        
        

        
    }
    
    
    
}
