/*menuPanel.java
 * Author: Andrew Lee
 * Date: June 13, 2017
 * To create  window and panels GUI for the menu splash
 */

import javax.swing.*;
import java.awt.*;
import java.io.*; 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


class menuPanel extends JPanel{

   BufferedImage menu=null;
    
     /**
   * menuPanel
   * This is a constructor for the menu panel
   * @param nothing as it creates the panel and loads images
   * @return Nothing because it is a constructor
   */
    public menuPanel() { 
        setPreferredSize(new Dimension(1600,1100));
      setFocusable(true);
      requestFocusInWindow();
      
   //load menu image
        try {
      menu = ImageIO.read(new File("menu.png"));
      
      
      
    } catch(Exception E) { 
      System.out.println("error loading picture!");
    }
    
  
     
    }
    
    
    public void paintComponent(Graphics g) { 
      super.paintComponent(g); //required to ensure the panel si correctly redrawn
   
   
  
      //draw menu background
   g.drawImage(menu,0,0,null);
       
    
    }
    
    
    
  
      
      
}