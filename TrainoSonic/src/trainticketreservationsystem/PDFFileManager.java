/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservationsystem;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfContentByte;
import java.text.ParseException;


/**
 *
 * @author nemo
 */
public class PDFFileManager  {

        private static final String FilePath = "p.pdf";
             private static final String ImagePath = "src\\Panels\\Images\\background_1.jpg";
            String pd,pd2,pd3,pd4,pd5,pd6,pd7;
                    int pd8;

    public static  void writePdf(String pd,String pd2,String pd3,String pd4,String pd5,String pd6,String pd7,int pd8){
   
     Document document = new Document();


        try {

           PdfWriter pout= PdfWriter.getInstance(document, new FileOutputStream(new File(FilePath)));
            //open
            document.open();

           
            
            Paragraph p1 = new Paragraph();
            p1.add("TicketNumber: "+pd); 
             p1.setAlignment(Element.ALIGN_CENTER);
            document.add(p1);
          
            Paragraph p2 = new Paragraph();
            p2.add("TrainID: "+pd2); 
            p2.setAlignment(Element.ALIGN_CENTER);
            document.add(p2);

            
            Paragraph p3 = new Paragraph();
            p3.add("BookedSeat : "+pd3); 
            p3.setAlignment(Element.ALIGN_CENTER);            
            document.add(p3);
   
           
            Paragraph p4 = new Paragraph();
            p4.add(pd4 + " ----> " + pd5); 
              p4.setAlignment(Element.ALIGN_CENTER);
            document.add(p4);
        
           
            
            Paragraph p6 = new Paragraph();
            p6.add("Date : \n"+pd6);
              p6.setAlignment(Element.ALIGN_CENTER);                        
            document.add(p6);
            
            Paragraph p7 = new Paragraph();
            p7.add("Time : "+pd7); 
             p7.setAlignment(Element.ALIGN_CENTER);
            document.add(p7);
             
            
            Paragraph p8 = new Paragraph();
            p8.add("Price : "+pd8+" L.E"); 
             p8.setAlignment(Element.ALIGN_CENTER);
            document.add(p8);
            
        
           /* Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);
*/
           PdfContentByte canvas = pout.getDirectContentUnder();
        Image image = Image.getInstance(ImagePath);

        image.scaleAbsolute(PageSize.A4.rotate());
       
        image.setAbsolutePosition(0,0);
           float width = document.getPageSize().getWidth();
        float height = document.getPageSize().getHeight();
        canvas.addImage(image, width, 0, 0, height, 0, 0);
            //close
            document.close();

           

           
        }
        
         catch(DocumentException | FileNotFoundException e){}
        catch(Exception e){}

    
    
    
    

    
    }
    
    
 
    
    
}



     
        



