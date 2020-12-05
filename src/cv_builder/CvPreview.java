package cv_builder;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CvPreview {
    static Label head,firstN,firstNF,lastN,lastNF,email,emailF,contact,contactF,dob,d,state,statel,city,cityF,
            nation,nationl,addrs,addrsF,sex,sex1,rdb,rdb1,about,aboutF,skill,skill0,skill1,skill2,skill3,pw,com,comF,
            dept,deptF,com2,comF2,dept2,deptF2,quals,jsce,jsceF,ssce,ssceF,bsce,bsceF;
    
    public static void preview(String fn, String ln,String em,String cont,String dobrt,String stat,String cite,
                               String nat,String adrs,String gender,String abt,String skil,String skil1,
                               String skil2,String skil3,String cpny,String deptT,String cpny1,String deptT1,
                               String jnr,String snr,String uni){
        
        Stage stage=new Stage();
         //Header
        head = new Label("PERSONAL");
        head.setStyle("-fx-font-family:monospace;-fx-font-size:20px;-fx-underline:true");

        /*---------------Personal Details ------------------*/
        firstN = new Label("First Name : ");
        firstNF  = new Label(fn.equals("")?"Empty":fn );
        lastN = new Label("Last Name : ");
        lastNF = new Label(ln.equals("")?"Empty":ln);
        email = new Label("Email : ");
        emailF = new Label(em.equals("")?"Empty":em);
        contact = new Label("Contact : ");
        contactF = new Label(cont.equals("")?"Empty":cont);
        dob = new Label("Date-of-Birth");
        d = new Label(dobrt.equals("")?"Empty":dobrt);
        state = new Label("State-of-origin : ");
        statel = new Label(stat.equals("")?"Empty":stat);
        city = new Label("City : ");
        cityF = new Label(cite.equals("")?"Empty":cite);
        nation = new Label("Nationality : ");
        nationl = new Label(nat.equals("")?"Empty":nat);
        addrs = new Label("Address : ");
        addrsF = new Label(adrs.equals("")?"Empty":adrs);
        sex = new Label("Gender : ");
        sex1 = new Label(gender.equals("")?"Empty":gender);
        about = new Label("About : ");
        aboutF = new Label(abt.equals("")?"Empty":abt);
        
        /*---------------SKILLS Section and previous work details------------------*/
        skill = new Label("PROFESSIONAL SKILLS");
        skill.setStyle("-fx-font-family:monospace;-fx-underline:true");
        skill0 = new Label(skil.equals("")?"Empty":skil);
        skill1 = new Label(skil1.equals("")?"Empty":skil1);
        skill2 = new Label(skil2.equals("")?"Empty":skil2);
        skill3 = new Label(skil3.equals("")?"Empty":skil3);
        pw = new Label("PREVIOUS JOBS");
        pw.setStyle("-fx-font-family:monospace;-fx-underline:true");
        com = new Label("Company Attached To: ");
        comF = new Label(cpny.equals("")?"Empty":cpny);
        dept = new Label("Department : ");
        deptF = new Label(deptT.equals("")?"Empty":deptT);
        com2 = new Label("Company Attached To: ");
        comF2 = new Label(cpny1.equals("")?"Empty":cpny);
        dept2 = new Label("Department : ");
        deptF2 = new Label(deptT1.equals("")?"Empty":deptT1);
        
        /*---------------Qualification details------------------*/
        quals = new Label("QUALIFICATION");
        quals.setStyle("-fx-font-family:monospace;-fx-font-size:20px;-fx-underline:true");
        jsce = new Label("Primary Certificate: ");
        jsceF = new Label(jnr.equals("")?"Empty":jnr);
        ssce = new Label("Secondary Certificate: ");
        ssceF = new Label(snr.equals("")?"Empty":snr);
        bsce = new Label("Tertiary Certificate: ");
        bsceF = new Label(uni.equals("")?"Empty":uni);
        
       GridPane grid=new GridPane();
       grid.setVgap(10);
       grid.setHgap(10);
       grid.setStyle("-fx-background-color: #ADC9FF;");
       
      
        

        /*---------------Personal Details position------------------*/
        GridPane.setConstraints(head, 3, 6);
        GridPane.setConstraints(firstN, 3, 7);
        GridPane.setConstraints(firstNF, 7, 7);
        GridPane.setConstraints(lastN, 3, 8);
        GridPane.setConstraints(lastNF, 7, 8);        
        GridPane.setConstraints(email, 3, 9);
        GridPane.setConstraints(emailF, 7, 9);
        GridPane.setConstraints(contact, 3, 10);
        GridPane.setConstraints(contactF, 7, 10);
        GridPane.setConstraints(dob, 3, 11);
        GridPane.setConstraints(d, 7, 11);
        GridPane.setConstraints(state, 3, 12);
        GridPane.setConstraints(statel, 7, 12);
        GridPane.setConstraints(city, 3, 13);
        GridPane.setConstraints(cityF, 7, 13);
        GridPane.setConstraints(nation, 3, 14);
        GridPane.setConstraints(nationl, 7, 14);
        GridPane.setConstraints(addrs, 3, 15);
        GridPane.setConstraints(addrsF, 7, 15);
        GridPane.setConstraints(sex, 3, 16);
        GridPane.setConstraints(sex1, 7, 16);
        GridPane.setConstraints(about, 3, 18);
        GridPane.setConstraints(aboutF, 7, 18);

        /*---------------Skill and previous work details------------------*/
        GridPane.setConstraints(skill, 16, 6);
        GridPane.setConstraints(skill0, 16, 7);
        GridPane.setConstraints(skill1, 17, 7);
        GridPane.setConstraints(skill2, 16, 8);
        GridPane.setConstraints(skill3, 17, 8);
        GridPane.setConstraints(pw, 16, 11);
        GridPane.setConstraints(com, 16, 12);
        GridPane.setConstraints(comF, 17, 12);
        GridPane.setConstraints(dept, 16, 13);
        GridPane.setConstraints(deptF, 17, 13);
        GridPane.setConstraints(com2, 16, 15);
        GridPane.setConstraints(comF2, 17, 15);
        GridPane.setConstraints(dept2, 16, 16);
        GridPane.setConstraints(deptF2, 17, 16);

        /*---------------Qualification details------------------*/
        GridPane.setConstraints(quals, 3, 20, 20, 3);
        GridPane.setConstraints(jsce, 3, 23);
        GridPane.setConstraints(jsceF, 7, 23);
        GridPane.setConstraints(ssce, 3, 24);
        GridPane.setConstraints(ssceF, 7, 24);
        GridPane.setConstraints(bsce, 3, 25);
        GridPane.setConstraints(bsceF, 7, 25);
       
        grid.getChildren().addAll(head, firstNF, firstN, lastN, lastNF,email, emailF,contact,contactF,dob, d,state, statel,
                                  city, cityF, nation, nationl, addrs, addrsF, sex, sex1,about, aboutF, skill, skill0,
                                  skill1,skill2, skill3, pw,com, comF, dept, deptF, com2, comF2, dept2, deptF2, quals,
                                   jsce, jsceF, ssce,ssceF, bsce, bsceF);               
        
        Scene scene = new Scene(grid, 900, 700);
        
        
        stage.setScene(scene);
        stage.setTitle("CV Builder");
        stage.show();
    }
    
    
}
