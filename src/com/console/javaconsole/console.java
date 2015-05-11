package com.console.javaconsole;

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

public class console {

    public static boolean ifAnswer;
    public static String usrAnswer;
    
    
    
     public static void gui(int x, int y) {
        
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
        
        
        TextAreaOutputStream taos = TextAreaOutputStream.getInstance(console);
        
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
                
                usrAnswer = printUsrInput;
                System.out.println(usrAnswer);
                ifAnswer = true;
                
                usrInput.setText("");
                
                
                
            }
        });

        
    }
     
    public static void scan() throws InterruptedException  {
		
		usrAnswer = (" ");
                
                ifAnswer = false;
                
                scanCheck();
                
                
                
	}
        
        public static void scanCheck() throws InterruptedException {
                
                    
                if (ifAnswer == true) {
                    
                    
                }
                else {
                    Thread.sleep(10);
                    scanCheck();
                    
                }
                
            }
    
}
