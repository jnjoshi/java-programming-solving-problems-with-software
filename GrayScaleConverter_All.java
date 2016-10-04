
/**
 * Write a description of class GrayScaleConverter here.
 * 
 * @author (JnJoshi) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;
public class GrayScaleConverter
{
   public ImageResource makeGray(ImageResource inImage)
   {
    //make a black screen of same size as image
    ImageResource outImage= new ImageResource(inImage.getWidth(), inImage.getHeight());
    //For each pixel 
    for(Pixel pixel: outImage.pixels())
        {
           Pixel inPixel = inImage.getPixel(pixel.getX(),pixel.getY());
           //compute pixel's RGB and add them and find average
           int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
           //set RGB to average to gray out
           pixel.setRed(average);
           pixel.setBlue(average);
           pixel.setGreen(average);
        }
        //outImage is answwer
        return outImage;
    }
   /* public void testGray()
    {
        ImageResource ir = new ImageResource();
        ImageResource gray = makeGray(ir);
        gray.draw();
    }
    */
   public void SelectAndConvert()
   {
      DirectoryResource dr = new DirectoryResource();
      for (File f: dr.selectedFiles())
      {
        ImageResource inImage = new ImageResource();
        ImageResource gray = makeGray(inImage);
        gray.draw();
        }
    }
}
