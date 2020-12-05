package pdfdemo; 

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddingTable {

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
       
         Document document = new Document();
        try {
            // step 2
            PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("/Users/Adoye/desktop/test.pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(AddingTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    document.setPageSize(PageSize.LETTER);
    document.setMargins(36, 72, 108, 180);
    document.setMarginMirroring(false);
    // step 3
    document.open();
    // step 4
    Rectangle rect= new Rectangle(36,108);
    rect.enableBorderSide(1);
    rect.enableBorderSide(2);
    rect.enableBorderSide(4);
    rect.enableBorderSide(8);
    rect.setBorder(2);
    rect.setBorderColor(BaseColor.BLACK);
    document.add(rect);
    }
    
}
