
/**
 * cal
 * Test Picture Classes

 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class colors
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      Picture p1ll = new Picture("images/kitten2.jpg");
      Picture p2ll = new Picture("images/kitten2.jpg");
      Picture p3ll = new Picture("images/kitten2.jpg");
      Picture p4ll = new Picture("images/kitten2.jpg");
      Picture p5ll = new Picture("images/kitten2.jpg");
      Picture p6ll = new Picture("images/kitten2.jpg");
      Picture p7ll = new Picture("images/kitten2.jpg");
      
      p1ll.explore();
      
      int red, green, blue, average;
      
      // make red
      
      Pixel[] pixels;
      pixels = p2ll.getPixels();
      
      for(Pixel spot : pixels) {
          spot.setRed((int)(spot.getRed() * 2));
      }
      
      p2ll.explore();
      
      // negative
      
      pixels = p3ll.getPixels();
      
      for(Pixel spot : pixels) {
          red = spot.getRed();
          spot.setRed((int)(255 - red));
          green = spot.getGreen();
          spot.setGreen((int)(255 - green));
          blue = spot.getBlue();
          spot.setBlue((int)(255 - blue));
      }
      
      p3ll.explore();
      
      // grayscale
      
      pixels = p4ll.getPixels();
      
      for(Pixel spot : pixels) {
          average = (int)(spot.getAverage());
          spot.setRed(average);
          spot.setGreen(average);
          spot.setBlue(average);
      }
      
      p4ll.explore();
      
      // lighten
      
      pixels = p5ll.getPixels();
      
      for(Pixel spot : pixels) {
          spot.setRed(spot.getRed() + 89);
          spot.setGreen(spot.getGreen() + 89);
          spot.setBlue(spot.getBlue() + 89);
      }
      
      p5ll.explore();
      
      // double
      
      pixels = p6ll.getPixels();
      
      for(Pixel spot : pixels) {
          spot.setRed(spot.getRed() * 2);
          spot.setGreen(spot.getGreen() * 2);
          spot.setBlue(spot.getBlue() * 2);
      }
      
      p6ll.explore();
      
      // pinkify
      
      pixels = p7ll.getPixels();
      
      for(Pixel spot : pixels) {
          spot.setRed(spot.getBlue());
      }
      
      p7ll.explore();
      
  }//main
}//class
