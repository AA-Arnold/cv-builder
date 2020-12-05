package cv_builder;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


import java.io.FileOutputStream;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import static javafx.scene.text.Font.font;
import javafx.scene.text.FontWeight;

public class CvFn extends Cv_Builder {
    
    
    public void btn(){
        
        Document docs = new Document();
        
        try{
        PdfWriter.getInstance(docs, new FileOutputStream("/Users/Adoye/desktop/Generated CV.pdf"));
        docs.open();
        
        
//          Font font = new Font();
          Paragraph p = new Paragraph( );
          
        Font f = new Font(FontFamily.HELVETICA, 25.0f, Font.BOLD,BaseColor.BLUE);
////        Chunk c = new Chunk("Name " + firstNF.getText(), f);
////        c.setBackground(BaseColor.RED);
//        Paragraph p = new Paragraph();
//        p.add(firstNF.getText());
        Paragraph[] paragraph ={
            new Paragraph("PERSONAL DETAILS",FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE) ),
            new Paragraph("------------------------------------------------------------------------"),
//            new Paragraph(new Chunk("Notes: ")),
            new Paragraph("Name :" + firstNF.getText()+" "+ lastNF.getText()),
            new Paragraph("Email :"+emailF.getText()),
            new Paragraph("Contact :"+contactF.getText()),
            new Paragraph("D.O.B :"+d.getValue().toString()),
            new Paragraph("state :"+statel.getValue()),
            new Paragraph("City :"+cityF.getText()),
            new Paragraph("Nationality :"+nationl.getValue()),
            new Paragraph("Address :"+addrsF.getText()),
            new Paragraph("Gender :"+sex1.getValue()),
            new Paragraph("Profile :"+aboutF.getText()),
            new Paragraph("PROFESSIONAL SKILLS",FontFactory.getFont(FontFactory.HELVETICA,18, BaseColor.BLUE) ),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("*"+skill0.getText()),
            new Paragraph("*"+skill1.getText()),
            new Paragraph("*"+skill2.getText()),
            new Paragraph("*"+skill3.getText()),
            new Paragraph(),
            new Paragraph("PREVIOUS JOBS DONE",FontFactory.getFont(FontFactory.HELVETICA,18, BaseColor.BLUE)),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("Previous Company :"+comF.getText()),
            new Paragraph("Department :"+deptF.getText()),
            new Paragraph("Previous Company :"+comF2.getText()),
            new Paragraph("Department :"+deptF2.getText()),
            new Paragraph(),
            new Paragraph("QUALIFICATION",FontFactory.getFont(FontFactory.HELVETICA,18, BaseColor.BLUE)),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("primary certificate :"+jsceF.getText()),
            new Paragraph("Secondary certificate :"+ssceF.getText()),
            new Paragraph("Tertiary certificate :"+bsceF.getText()),
            
            
        };

        for (int i =0;i<paragraph.length;i++){
            docs.add(paragraph[i]);
        }
        
        docs.close();
        
        
            System.out.println("successful");
             // create a alert 
           Alert a = new Alert(AlertType.CONFIRMATION);
           a.show();
        }catch(Exception e){
            System.out.println(e);
        }

        
//        System.out.println(firstNF.getText());
//        System.out.println(lastNF.getText());
//        System.out.println(emailF.getText());
//        System.out.println(contactF.getText());
//        System.out.println(d.getValue());
//        System.out.println(statel.getValue());
//        System.out.println(cityF.getText());
//        System.out.println(nationl.getValue());
//        System.out.println(addrsF.getText());
//        System.out.println(sex1.getValue());
//        System.out.println(aboutF.getText());
//        System.out.println(skill0.getText());
//        System.out.println(skill1.getText());
//        System.out.println(skill2.getText());
//        System.out.println(skill3.getText());
//        System.out.println(comF.getText());
//        System.out.println(deptF.getText());
//        System.out.println(comF2.getText());
//        System.out.println(deptF2.getText());
//        System.out.println(jsceF.getText());
//        System.out.println(ssceF.getText());
    }

    
    
}
