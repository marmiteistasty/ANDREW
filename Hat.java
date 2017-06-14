/*Hat.java
 * Author: Andrew Lee
 * Date: June 13, 2017
 * To create ability objects, gives the user a selection of abilities, runs abilities
 */
 
import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class Hat extends JFrame{
  private int type;
  
     /**
   * Hat
   * This is a constructor for the hat object
   * @param start, checks if the object is created at the start or not
   * @return Nothing because it is a constructor
   */
  
  Hat(Boolean start){
    if (start ==true){
    setTitle("Selection");
    setSize(1600, 1100);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // set the window up to end the program when closed
    
    MyMouseListener mouseListener = new MyMouseListener();
    this.addMouseListener(mouseListener);

    
    setFocusable(true);
      requestFocusInWindow();
  
     getContentPane().add( new hatSelectionPanel(),BorderLayout.CENTER);
     
    pack(); //makes the frame fit the contents
    setVisible(true);
    }
  }

  

  //Inner class mouselistener for selection of ability
   private class MyMouseListener implements MouseListener {
      
     public void mouseClicked(MouseEvent e) {
    int x=e.getX();
    int y=e.getY();
    
    if (x>249 && x<451 && y>549 && y<751){

      GameWindow game= new GameWindow();
      type=1;
      setVisible(false);
     
    }else if (x>549 && x<751 && y>549 && y<751){
      GameWindow game= new GameWindow();
      type=2;
      setVisible(false);
    }else if (x>849 && x<1051 && y>549 && y<751){
      GameWindow game= new GameWindow();
      type=3;
   
      setVisible(false);
    }else if (x>1149 && x<1351 && y>549 && y<751){
      GameWindow game= new GameWindow();
      type=4;
      setVisible(false);
    }
    
}
      
      public void mousePressed(MouseEvent e) {
      }

      public void mouseReleased(MouseEvent e) {
      }

      public void mouseEntered(MouseEvent e) {
      }

      public void mouseExited(MouseEvent e) {
      }

 
}
    
    
  
  
  Hat(double x, double y){
    
  
  }
  
  public int getHat(){
    return type;
  }
 
  
 public int speedHat(int speed) { 
 speed = 700;
    return speed;
 }
 

 
 
 
 

 public double dashHatX(double x, int direction) { 
   
   
   if (direction==1 && x+10<1600){    //Andrew code 
          return (x+100);
        }else if (direction==0 && x-10>0){
          return (x-100);
        }else{
          return x;
        }
        
        
   }
     
 
 public double dashHatY(double y, int direction) { 
   
   
   if (direction==0 && y+10<900){    //Andrew code 
          return (y+100);
        }else if (direction==1 && y-10>0){
          return (y-100);
        }else{
          return y;
        }
        
        
   }
 
 
 
 }
   
   
  

  

 
  
  
  
