
/**
 * Write a description of class Invert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class Invert
{

   public ImageResource Inverting(ImageResource inImage)
   {
    //make a black screen of same size as image
    ImageResource outImage= new ImageResource(inImage.getWidth(), inImage.getHeight());
    //For each pixel 
    for(Pixel pixel: outImage.pixels())
        {
           Pixel inPixel = inImage.getPixel(pixel.getX(),pixel.getY());
           //set RGB to average to gray out
           pixel.setRed(255 - inPixel.getRed());
           pixel.setBlue(255 - inPixel.getBlue());
           pixel.setGreen(255 - inPixel.getGreen());
        }
        //outImage is answwer
        return outImage;
    }
   public void testGray()
    {
        ImageResource ir = new ImageResource();
        ImageResource gray = Inverting(ir);
        gray.draw();
    }

}
