/*instructionsPanel.java
 * Author: Andrew Lee
 * Date: June 13, 2017
 * To create  window and panels GUI for instructions
 */

import javax.swing.*;
import java.awt.*;
import java.io.*; 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;







class instructionsPanel extends JPanel{

   BufferedImage instructions=null;
    
   //setup buttons
    JButton newgameButton = new JButton("New Game");
    JButton instructionButton = new JButton("Instructions");
    JButton quitButton = new JButton("Quit Game");
  
     
    
     /**
   * instructionsPanel
   * This is a constructor for the instructions panel
   * @param nothing as it constructs the panel and loads images
   * @return Nothing because it is a constructor
   */
    public instructionsPanel() { 
        setPreferredSize(new Dimension(1600,1100));
      setFocusable(true);
      requestFocusInWindow();
   
      //load image
        try {
      instructions = ImageIO.read(new File("instructions.png"));
      
      
      
    } catch(Exception E) { 
      System.out.println("error loading picture!");
    }
    
    //add buttons to screen
    this.add(newgameButton);
  this.add(instructionButton);
     this.add(quitButton);
    }
    
    
    public void paintComponent(Graphics g) { 
      super.paintComponent(g); //required to ensure the panel is correctly redrawn
   

      //draw instructions
   g.drawImage(instructions,0,0,null);
       
      
      //request a repaint
     
      repaint();
    }
    
    
    
  
      
      
}
