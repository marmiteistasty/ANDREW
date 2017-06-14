/*Menu.java
 * Author: Andrew Lee
 * Date: June 13, 2017
 * To create  window, panels, buttons GUI for menu
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.awt.*;
import java.io.*; 


class Menu extends JFrame{
  
  
    
  //class variables - needed outside main method
 
  
  
   /**
   * Menu
   * This is a constructor for the menu
   * @param nothing as it is creates the frame of the window and panels
   * @return Nothing because it is a constructor
   */
  Menu() { 
  
    //Set up the Frame
     setTitle("Scrapting");
     setPreferredSize(new Dimension(1600,1100));
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // set the window up to end the program when closed
    
    JPanel menuPanel = new menuPanel();
    menuPanel.setLayout(new FlowLayout());

    

    
   
    setFocusable(true);
      requestFocusInWindow();
      
  


    // Set up the buttons
    
   
    JButton newgameButton = new JButton("New Game");
    newgameButton.addActionListener(new StartButtonListener());
    
  
    
    JButton instructionButton = new JButton("Instructions");
    instructionButton.addActionListener(new instructionsButtonListener());
    
   
    
    JButton quitButton = new JButton("Quit Game");
    quitButton.addActionListener(new QuitListener());

  
   
   
 
             //adding buttons to main panel                
   menuPanel.add(newgameButton);                                        
   menuPanel.add(instructionButton);                 
       menuPanel.add(quitButton);                 
 
        
       
        
       
        //adding panel to frame
        this.add(menuPanel);
    
    
    
          
          
    //Start the app
    pack(); //makes the frame fit the contents
    setVisible(true);
  }
  
  
  //Inner class - to listen for button click
  
 class StartButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
  
    
  //begin game by starting with ability selection
     Hat select=new Hat(true);
     //close menu window
     setVisible(false);
     
     
    }
    
    
 }
 
 class instructionsButtonListener extends JPanel implements ActionListener {  //this is the required class definition

    
   
    public void actionPerformed(ActionEvent event)  {
      
      

      //show instructions image
     getContentPane().add( new instructionsPanel(),BorderLayout.CENTER);
     

     
     
    pack(); //makes the frame fit the contents
 
 }
 }
 
 
 //quit button
 class QuitListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      //exit program if quit button is clicked
        System.exit(0);
    }
}
    

      
    }


  
  
