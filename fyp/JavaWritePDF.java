/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp;

/**
 *
 * @author Colm
 */
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfBorderArray;
import com.itextpdf.text.pdf.PdfDestination;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
 
public class JavaWritePDF {
 
    /**
     * @param args
     *
     */
    
    public static String SRC = "";
    public static String IMG = "";
    public static String IMG2 = "";
    public static String DEST = "";
    
    public static void main(String file_1,String file_2, String filename1,String filename2, int temp) throws IOException, DocumentException {
        SRC = file_2; // source file name
        IMG = filename1; // session one chart image name
        IMG2 = filename2; // session two chart image name
        DEST = file_1; // destination file name
        File file1 = new File(DEST); // create new file
        file1.getParentFile().mkdirs();
        if(temp==2){ // if session number 1
            new JavaWritePDF().manipulatePdf(SRC, DEST);
        }
        else{ // if session number 2 
            new JavaWritePDF().manipulatePdf2(SRC, DEST);
        }
    }
    public void manipulatePdf(String src, String dest) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(src); // read source file
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest)); // create destination file
        stamper.insertPage(reader.getNumberOfPages() + 1,reader.getPageSizeWithRotation(1)); // insert new page 
        Image img = Image.getInstance(IMG); // get instance of image file 
        img.setAbsolutePosition(0,350);
        stamper.getOverContent(2).addImage(img); // insert image to new page
        stamper.close(); // close stamper
        File delfile = new File(SRC);
        delfile.delete(); // delete source file 
        respiratorytest.success();
    }
    
    public void manipulatePdf2(String src, String dest) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(src);
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
        stamper.insertPage(reader.getNumberOfPages() + 1,reader.getPageSizeWithRotation(1)); 
        stamper.insertPage(reader.getNumberOfPages() + 1,reader.getPageSizeWithRotation(1));// create a second new page
        Image img = Image.getInstance(IMG);
        Image img2 = Image.getInstance(IMG2);
        img.setAbsolutePosition(0,350);
        img2.setAbsolutePosition(0,350);
        stamper.getOverContent(2).addImage(img);
        stamper.getOverContent(3).addImage(img2); // add the second sessions image to the new page
        stamper.close();
        File delfile = new File(SRC);
        delfile.delete();
        respiratorytest.success();
    }
    
 
}