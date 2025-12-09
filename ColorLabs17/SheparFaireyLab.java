
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
      
      int average, min = 255, max = 0, one = 0, two = 0, three = 0, four = 0, choice = 2;
         //opens selfie picture 
          /**/
         //String fileName = FileChooser.pickAFile();
         //Picture pictObj = new Picture(fileName);
         //pictObj.explore();
         
         //relative path
         Picture p1c = new Picture("images\\me.jpg");
         
         Color darkblue = new Color(0, 48, 80);
         Color myred = new Color(218, 20, 21);
         Color cyan = new Color(112, 150, 160);
         Color offwhite = new Color(250, 227, 173);
         
         Color c1 = new Color(51, 43, 123);
         Color c2 = new Color(145, 69, 141);
         Color c3 = new Color(240, 85, 119);
         Color c4 = new Color(243, 160, 104);
         Color c5 = new Color(243, 235, 122);
         Color c6 = new Color(232, 236, 232);
         
      Pixel[] pixels;
      pixels = p1c.getPixels();
      
      
      for(Pixel spot : pixels) {
          average = (int)spot.getAverage();
           /*if(spot.getAverage() < min)
              min = (int)spot.getAverage();
          if(average > max)
              max = (int)spot.getAverage();*/
              
              //System.out.println(min + " " + max);
  
          if(choice == 1) {
          if(average < 55)
              spot.setColor(darkblue);
          if(average > 54 && average < 84)
              spot.setColor(myred);
          if(average > 85 && average < 141)
              spot.setColor(cyan);
          if(average > 140 && average < 161)
              spot.setColor(offwhite);
          if(average > 160)
              spot.setColor(Color.white);
            }
          
              if(choice == 2) {
              if(average < 56)              
                  spot.setColor(c1);
              if(average > 45 && average < 55)
                  spot.setColor(c2);
              if(average > 54 && average < 86)
                  spot.setColor(c3);
              if(average > 85 && average < 126)
                  spot.setColor(c4);
              if(average > 125 && average < 146)
                  spot.setColor(c5);
              if(average > 145)
                  spot.setColor(c6);
            }
      }
    
      //System.out.println("one " + ((double)(one)/1498176 * 100) + " two " + ((double)(two)/1498176 * 100) + " three " + ((double)(three)/1498176 * 100) + " four " + ((double)(four)/1498176 * 100));
      
      p1c.explore();
      
     //p1c.write("images/final.jpg");
      
    }//main       
}//class
