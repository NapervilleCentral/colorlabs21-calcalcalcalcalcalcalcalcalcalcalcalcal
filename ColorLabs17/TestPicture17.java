
/**
 * cal
 * Test Picture Classes

 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     //String fileName = FileChooser.pickAFile();
     //Picture pictObj = new Picture(fileName);
     //pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     // know relative path
     //relative path
     //Picture apic = new Picture("images\\beach.jpg"); // only jpg and bitmap and gif and tiff  (?)
     //Picture ferris1 = new Picture("images/caterpillar.jpg");
     //Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
    //Picture kitten = new Picture("images/kitten2.jpg");

    //Picture pill = new Picture("images/caterpillar.jpg");
     
     //apic.explore(); displays picture
     //kitten.explore();
    // pill.explore();
     
     //makes an array of pixels
     //Pixel[] pixels;
     
     
     //gets pixels from picture and assigns to pixels array
     //pixels = kitten.getPixels();
    
     //how many pixels or how large array
    //System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index
    //System.out.println(pixels[17]);
    //access each pixel
    // Pixel spot = kitten.getPixel(100,100);
    // Pixel spot2 = kitten.getPixel(289, 244);
    
    // Pixel kitt = pixels[17];
    // kitt.setRed(240);
    // kitt.setGreen(240);
    // kitt.setBlue(240);
    
    // System.out.println(pixels[17].getColor());
    // System.out.println(spot);
    
    // spot2.setColor(Color.yellow);
    
    // Color newColor = new Color(255, 0, 0);
    // spot.setColor(newColor);
    
    // for(int i = 0; i <= 200; i++) {
        // //Pixel yay = kitten.getPixel(((int)Math.random() * 10), ((int)Math.random() * 10));
        // //yay.setColor(Color.yellow);
        // (kitten.getPixel(0, i)).setColor(Color.yellow);
        // (kitten.getPixel(1, i)).setColor(Color.yellow);
        // (kitten.getPixel(2, i)).setColor(Color.yellow);
        // (kitten.getPixel(3, i)).setColor(Color.yellow);

    // }
    
    // kitten.explore();
    
    // int red;
    // Pixel[] mpixels;
    // mpixels = kitten.getPixels();
    
    // for(Pixel spot1 : mpixels) {
        // System.out.println(spot1);
        // red = spot1.getRed();
        // red = (int)(red * .25);
        // spot1.setRed(red);
    // }
    
    // int blue, green;
    // for(Pixel spot1 : mpixels) {
        // blue = (int)(spot1.getBlue() * Math.random());
        // spot1.setBlue(blue);
        // green = (int)(spot1.getGreen() * Math.random());
        // spot1.setGreen(green);
        // red = (int)(spot1.getRed() * Math.random());
        // spot1.setRed(red);
    // }
    // kitten.explore();
    
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
    Picture temple = new Picture("images/temple.jpg");
    Picture canvas = new Picture("images/canvas.jpg");
    Picture pou = new Picture("images/pou.jpg");
    Picture pousad = new Picture("images/pousad.jpg");
    Picture pou2 = new Picture("images/pou.jpg");
    Picture pou3 = new Picture("images/pou.jpg");
    Picture pou4 = new Picture("images/pou.jpg");
    Picture pou5 = new Picture("images/pou.jpg");
    Picture pou6 = new Picture("images/pou.jpg");
    Picture pou7 = new Picture("images/pou.jpg");
    Picture pou8 = new Picture("images/pou.jpg");
    copyTo(pou, canvas, 0, 0);
    mirrorVert(pou2);
    copyTo(pou2, canvas, 1000, 0);
    blend(pou3, pousad);
    copyTo(pou3, canvas, 2000, 0);
    scaling(pou4, pou5, pou.getHeight()/2, pou.getWidth()/2, pou.getHeight()/2, pou.getWidth()/2);
    copyTo(pou4, canvas, 0, 1500);
    posterize(pou5);
    copyTo(pou5, canvas, 1000, 1500);
    edgeDetection(pou8);
    copyTo(pou8, canvas, 2000, 1500);
    canvas.explore();
    canvas.write("images/finalpic.jpg");
    // mirrorTemple(temple);
    // temple.explore();
    // copyTo(pou, canvas, 0, 0);
    // mirrorVert(pou);
    // copyTo(pou, canvas, 1000, 0);
    // canvas.explore();
  }//main
  public static void negation(Picture source) {
      Pixel pixel = null;
      int rValue = 0;
      int gValue = 0;
      int bValue = 0;
      Color inverted = new Color(255, 255, 255);
      for(int y = 0; y < source.getHeight(); y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              rValue = pixel.getRed();
              gValue = pixel.getGreen();
              bValue = pixel.getBlue();
              inverted = new Color(255 - rValue, 255 - gValue, 255 - bValue);
              pixel.setColor(inverted);
          }
      }
  }
  public static void grayScale(Picture source) {
      Pixel pixel = null;
      Color Gray = new Color(255, 255, 255);
      int average = 0;
      for(int y = 0; y < source.getHeight(); y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              average = (int)(pixel.getAverage());
              Gray = new Color(average, average, average);
              pixel.setColor(Gray);
          }
      }
  }
  public static void sepia(Picture source) {
      Pixel pixel = null;
      Color sepiaBrown = new Color(112, 66, 20);
      int rValue = 0;
      int gValue = 0;
      int bValue = 0;
      //grayScale(source);
      for(int y = 0; y < source.getHeight(); y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              rValue = pixel.getRed();
              gValue = pixel.getGreen();
              bValue = pixel.getBlue();
              sepiaBrown = new Color((rValue + 112)/2, (gValue + 66)/2, (bValue + 20)/2);
              pixel.setColor(sepiaBrown);
          }
      }
  }
  public static void posterize(Picture source) {
      int average, min = 255, max = 0, one = 0, two = 0, three = 0, four = 0, choice = 2;
      Color c1 = new Color(51, 43, 123);
      Color c2 = new Color(145, 69, 141);
      Color c3 = new Color(240, 85, 119);
      Color c4 = new Color(239, 180, 104);
      Color c5 = new Color(243, 235, 122);
      Color c6 = new Color(232, 236, 232);
      Pixel pixel = null;
      
      for(int y = 0; y < source.getHeight(); y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              average = (int)pixel.getAverage();
              if(average < 56)              
                  pixel.setColor(c1);
              if(average > 55 && average < 87)
                  pixel.setColor(c2);
              if(average > 86 && average < 95)
                  pixel.setColor(c3);
              if(average > 94 && average < 110)
                  pixel.setColor(c4);
              if(average > 109 && average < 152)
                  pixel.setColor(c5);
              if(average > 150)
                  pixel.setColor(c6);
          }
      }
  }
  public static void edgeDetection(Picture source) {
      Pixel pixel = null;
      Pixel pixel2 = null;
      int average = 0;
      int average2 = 0;
      int detection = 8;
      int difference = 0;
      //grayScale(source);
      for(int y = 0; y < source.getHeight() - 1; y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              pixel2 = source.getPixel(x, y + 1);
              average = (int)(pixel.getAverage());
              average2 = (int)(pixel2.getAverage());
              difference = Math.abs(average - average2);
              if(difference > detection)
                  pixel.setColor(Color.red);
              else
                  pixel.setColor(Color.black);
          }
      }
  }
  public static void blend(Picture source, Picture other) {
      Pixel pixel = null;
      Pixel otherP = null;
      int rValue = 0;
      int gValue = 0;
      int bValue = 0;
      int rValue2 = 0;
      int gValue2 = 0;
      int bValue2 = 0;
      Color color = new Color(0, 0, 0);
      for(int y = 0; y < source.getHeight(); y++) {
          for(int x = 0; x < source.getWidth(); x++) {
              pixel = source.getPixel(x, y);
              otherP = other.getPixel(x, y);
              rValue = pixel.getRed();
              gValue = pixel.getGreen();
              bValue = pixel.getBlue();
              rValue2 = otherP.getRed();
              gValue2 = otherP.getGreen();
              bValue2 = otherP.getBlue();
              color = new Color((2*rValue + rValue2)/3, (2*gValue + gValue2)/3, (2*bValue + bValue2)/3);
              pixel.setColor(color);
          }
      }
  }
  public static void scaling(Picture source, Picture other) {
      Pixel pixel = null;
      Pixel pixel2 = null;
      int var = source.getHeight();
      int var2 = source.getWidth();
      Color color = new Color(0, 0, 0);
      for(int y = source.getHeight()/4, y2 = 0; y2 < source.getHeight() && y < other.getHeight(); y++, y2 += 2) {
          for(int x = source.getWidth()/4, x2 = 0; x2 < source.getWidth() && x < other.getWidth(); x++, x2 += 2) {
              pixel = source.getPixel(x, y);
              pixel2 = other.getPixel(x2, y2);
              color = pixel2.getColor();
              pixel.setColor(color);
          }
      }
      //scaling(source, other, var/2, var2/2);
  }
  public static void scaling(Picture source, Picture other, int var, int var2, int othervar3, int othervar4) {
      if(var >= 2 && var2 >= 2) {
      Pixel pixel = null;
      Pixel pixel2 = null;
      int othervar = source.getHeight()/var;
      int othervar2 = source.getWidth()/var2;
      Color color = new Color(0, 0, 0);
      System.out.println(othervar);
      
      if(var == source.getHeight()/2) {
          //System.out.println(source.getHeight());
          for(int y = 0, y2 = 0; y2 < source.getHeight() && y < other.getHeight(); y++, y2 += 2) {
              for(int x = 0, x2 = 0; x2 < source.getWidth() && x < other.getWidth(); x++, x2 += 2) {
                  pixel = source.getPixel(x, y);
                  pixel2 = other.getPixel(x2, y2);
                  color = pixel2.getColor();
                  pixel.setColor(color);
              }
          }
          scaling(source, other, var/2, var2/2, source.getHeight(), source.getWidth());
          return;
      }
      
          for(int y = 0, y2 = 0; y2 < source.getHeight() && y < other.getHeight(); y++, y2 += othervar) {
              for(int x = 0, x2 = 0; x2 < source.getWidth() && x < other.getWidth(); x++, x2 += othervar2) {
                  pixel = source.getPixel(x, y);
                  pixel2 = other.getPixel(x2, y2);
                  color = pixel2.getColor();
                  pixel.setColor(color);
              }
          }
          scaling(source, other, var/2, var2/2, othervar3/2, othervar4/2);
    }
  }
  // public static void scaling(Picture source, Picture other, int[] arr, int othervar3, int othervar4) {
      // if(var >= 2 && var2 >= 2) {
      // Pixel pixel = null;
      // Pixel pixel2 = null;
      // int othervar = source.getHeight()/var;
      // int othervar2 = source.getWidth()/var2;
      // Color color = new Color(0, 0, 0);
      // System.out.println(othervar);
      
      // if(var == source.getHeight()/2) {
          // //System.out.println(source.getHeight());
          // for(int y = var/2, y2 = 0; y2 < source.getHeight() && y < other.getHeight(); y++, y2 += 2) {
              // for(int x = var2/2, x2 = 0; x2 < source.getWidth() && x < other.getWidth(); x++, x2 += 2) {
                  // pixel = source.getPixel(x, y);
                  // pixel2 = other.getPixel(x2, y2);
                  // color = pixel2.getColor();
                  // pixel.setColor(color);
              // }
          // }
          // scaling(source, other, var/2, var2/2, source.getHeight(), source.getWidth());
          // return;
      // }
      
          // for(int y = var + othervar3/4, y2 = 0; y2 < source.getHeight() && y < other.getHeight(); y++, y2 += othervar) {
              // for(int x = var2 + othervar4/4, x2 = 0; x2 < source.getWidth() && x < other.getWidth(); x++, x2 += othervar2) {
                  // pixel = source.getPixel(x, y);
                  // pixel2 = other.getPixel(x2, y2);
                  // color = pixel2.getColor();
                  // pixel.setColor(color);
              // }
          // }
          // scaling(source, other, var/2, var2/2, othervar3/2, othervar4/2);
    // }
  // }
  /*
   * mirror on a vertical line in the middle of the picture based on width
   */
  public static void mirrorTemple(Picture source) {
      int width = 277*2;
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      // loop through all the rows starting with y
      for(int y = 0; y < 150; y++) {
          // loop from 0 to the middle (mirror point)
          for(int x = 0; x < mirrorPoint; x++) {
              leftPixel = source.getPixel(x, y);
              rightPixel = source.getPixel(width - 1 - x, y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }
  public static void mirrorVert(Picture source) {
      int width = source.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      // loop through all the rows starting with y
      for(int y = 0; y < source.getHeight(); y++) {
          // loop from 0 to the middle (mirror point)
          for(int x = 0; x < mirrorPoint; x++) {
              leftPixel = source.getPixel(x, y);
              rightPixel = source.getPixel(width - 1 - x, y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }
  /* copy
   * add 2 ints to params to place it bruhhguhuhrhub hurbhbrubh
   */
  public static void copyTo(Picture source, Picture target, int x, int y) { // skipping every other pixel makes it smaller, += .5 makesit bigger
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      // loop through j columns (target x sthe starting point on the canvas)
      for(int sourceX = 0, targetX = x; sourceX < source.getWidth(); sourceX++, targetX++) {
          for(int sourceY = 0, targetY = y; sourceY < source.getHeight(); sourceY++, targetY++) {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
}//class
/*
 *
 */