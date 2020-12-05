package CV;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class CvBuilder extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       // scene one
       
       Label stat1 = new Label("Create Your Cv");
        Label stat2 = new Label("Personal Details");
        
       Label firstnamelabel = new Label("FirstName");
        TextField firstnametextfield = new TextField();
        firstnametextfield.setPromptText("Enter your firstname");
        
         Label middlenamelabel = new Label("MiddleName");
        TextField middlenametextfield = new TextField();
        middlenametextfield.setPromptText("Enter your middlename");
        
        
        Label lastnamelabel = new Label("LastName");
        TextField lastnametextfield = new TextField();
        lastnametextfield.setPromptText("Enter your lastname");
        
        Label contactaddlabel = new Label ("Contact Address");
        TextArea contactadd = new TextArea("");
        contactadd.setPromptText("Enter your address");
        
        Label phoneno = new Label("Phone Number");
        TextField phonenofield = new TextField();
         phonenofield.setPromptText("Enter your address");
         
          
        Label email = new Label("Email");
        TextField emailfield = new TextField();
         emailfield.setPromptText("Enter your address");
         
         Button nextButton =new Button("Next");
         
          GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10); 
        
        GridPane.setConstraints(stat1,0,0);
         GridPane.setConstraints(stat2,0,1);
         GridPane.setConstraints(firstnamelabel,0,2);
         GridPane.setConstraints(firstnametextfield,1,2);
         GridPane.setConstraints(middlenamelabel,0,3);
         GridPane.setConstraints(middlenametextfield,1,3);
         GridPane.setConstraints(lastnamelabel,0,4);
         GridPane.setConstraints(lastnametextfield,1,4);
         GridPane.setConstraints(contactaddlabel,0,5);
         GridPane.setConstraints(contactadd,1,5);
         GridPane.setConstraints(phoneno,0,6);
         GridPane.setConstraints(phonenofield,1,6);
         GridPane.setConstraints(email,0,7);
         GridPane.setConstraints(emailfield,1,7);
         GridPane.setConstraints(nextButton,1,8);
            
        grid.getChildren().addAll(stat1,stat2,firstnamelabel,firstnametextfield,middlenamelabel,middlenametextfield
        ,lastnamelabel,lastnametextfield,contactaddlabel,contactadd,phoneno,phonenofield,email,emailfield,nextButton);
         Scene scene1 = new Scene(grid,600,500);
         
         // scene two
         Label stat3 = new Label("Personal Profile");
         Label personalstat = new Label("Personal Statement");
         TextArea  personalstat1= new TextArea();
         
         Label keyskills =new Label("Key Skills");
         TextField keyskillfield = new TextField();
         
         TextField keyskillfield2 = new TextField();
        
         
         Label interests = new Label("Interests and Achievements");
         TextArea interesta = new TextArea();
         Button nextbutton1 = new Button("Next");
         Button backbutton = new Button("Back");
          GridPane grid1 = new GridPane();
        grid1.setVgap(10);
        grid1.setHgap(10);
        GridPane.setConstraints(stat3,0,0);
        GridPane.setConstraints(personalstat,0,1);
        GridPane.setConstraints(personalstat1,1,1);
        GridPane.setConstraints(keyskills,0,2);
        GridPane.setConstraints(keyskillfield,1,2);
        
        GridPane.setConstraints(keyskillfield2,1,3);
      
       GridPane.setConstraints(interests,0,4);
       GridPane.setConstraints(interesta,1,4);
       GridPane.setConstraints(backbutton,1,5);
       GridPane.setConstraints(nextbutton1,2,5);
        
        
        grid1.getChildren().addAll(stat3,personalstat,personalstat1,keyskills,keyskillfield,keyskillfield2
        ,interests,interesta,backbutton,nextbutton1);
         Scene scene2 = new Scene(grid1,900,550);
          backbutton.setOnAction(e -> primaryStage.setScene(scene1));
         nextButton.setOnAction(e -> primaryStage.setScene(scene2));
         
         // scene three
         Label stat4 = new Label("Education");
         Label schoollabel = new Label("School/College Name");
         TextField schoolfield = new TextField();
         
         Label start = new Label("Start Date");
           ChoiceBox<String>level1 = new ChoiceBox<>();
        level1.getItems().addAll("January","Febuary","March","April","May","June","July","August","September"
        ,"October","November","December");
        level1.setValue("January");
          ComboBox<String> combo1 = new ComboBox<>();
        combo1.getItems().addAll("1991","1992","1993","1994","1995","1996","1997","1998","1999");
        combo1.setValue("1991");
        combo1.setEditable(true);
        
         Label end = new Label("End Date");
           ChoiceBox<String>level2 = new ChoiceBox<>();
        level2.getItems().addAll("January","Febuary","March","April","May","June","July","August","September"
        ,"October","November","December");
        level2.setValue("January");
          ComboBox<String> combo2 = new ComboBox<>();
        combo2.getItems().addAll("1991","1992","1993","1994","1995","1996","1997","1998","1999");
        combo2.setValue("1991");
        combo2.setEditable(true);
        CheckBox cb = new CheckBox("Are You Still Attending");
        Button addnext = new Button("Add Further Education");
        Label stat5 = new Label("Qualifications");
        Label subject = new Label("Subject");
        TextField subjectfield = new TextField();
        Label qualitype = new Label("Qualification Type");
         ComboBox<String> combo3 = new ComboBox<>();
        combo3.getItems().addAll("Bsc","HnD","BTech","SSCE","A Level","Diploma");
        combo3.setValue("Bsc");
        combo3.setEditable(true);
        Label grade = new Label("Grade");
        TextField gradefield = new TextField();
         Button addnext1 = new Button("Add Further Education");
        
          Button nextbutton2 = new Button("Next");
         Button backbutton1 = new Button("Back");
        GridPane grid2 = new GridPane();
        grid2.setVgap(10);
        grid2.setHgap(10);
        GridPane.setConstraints(stat4,0,0);
        GridPane.setConstraints(schoollabel,0,1);
        GridPane.setConstraints(schoolfield,1,1);
        GridPane.setConstraints(start,0,2);
        GridPane.setConstraints(level1,1,2);
        GridPane.setConstraints(combo1,2,2);
        GridPane.setConstraints(end,0,3);
        GridPane.setConstraints(level2,1,3);
        GridPane.setConstraints(combo2,2,3);
        GridPane.setConstraints(cb,3,3);
        GridPane.setConstraints(addnext,3,4);
         GridPane.setConstraints(stat5,0,5);
          GridPane.setConstraints(subject,0,6);
           GridPane.setConstraints(subjectfield,1,6);
            GridPane.setConstraints(qualitype,0,7);
             GridPane.setConstraints(combo3,1,7);
              GridPane.setConstraints(grade,0,8);
               GridPane.setConstraints(gradefield,1,8);
                GridPane.setConstraints(addnext1,3,9);
                 GridPane.setConstraints(backbutton1,2,10);
         GridPane.setConstraints(nextbutton2,3,10);
         grid2.getChildren().addAll(stat4,schoollabel,schoolfield,start,level1,combo1,end,level2,combo2,cb,
                 addnext,stat5,subject,subjectfield,qualitype,combo3,grade,gradefield,addnext1,backbutton1,
                 nextbutton2);
         Scene scene3 = new Scene(grid2,700,400);
           backbutton1.setOnAction(e -> primaryStage.setScene(scene2));
          nextbutton1.setOnAction(e -> primaryStage.setScene(scene3));
         
         // scene four 
         Label stat6  = new Label("Work Experience Placement");
         Label job = new Label("Job Title");
         TextField jobfield = new TextField();
         Label company1 = new Label("Company");
         TextField companynme = new TextField();
         Label town = new Label("Town/City");
         TextField townfield = new TextField();
         Label placement = new Label("Placement Duration");
          ChoiceBox<String>level3 = new ChoiceBox<>();
        level3.getItems().addAll("1 Week","2 Weeks","3 Weeks","4 Weeks","5 Weeks","6 Weeks","7 Weeks","8 Weeks","9 Weeks"
        ,"10 Weeks or More");
        level3.setValue("1 Week");
        Button addbutton2 = new Button("Add Further Education");
        Label stat7 = new Label("Work History");
        Label jobti = new Label("Job Title");
        TextField jobtifield = new TextField();
        Label companyname = new Label("Company Name");
        TextField companyfield = new TextField();
        Label type = new Label("Type Of Work");
         ChoiceBox<String>level4 = new ChoiceBox<>();
        level4.getItems().addAll("Full Time","Part Time","Voluntary","Intern","Other");
        level4.setValue("Full Time");
        Label jobdu = new Label("Job Duties And Responsibilties");
        TextArea jobdut = new TextArea();
         Label start1 = new Label("Start Date");
           ChoiceBox<String>level5 = new ChoiceBox<>();
        level5.getItems().addAll("January","Febuary","March","April","May","June","July","August","September"
        ,"October","November","December");
        level5.setValue("January");
          ComboBox<String> combo4 = new ComboBox<>();
        combo4.getItems().addAll("1991","1992","1993","1994","1995","1996","1997","1998","1999");
        combo4.setValue("1991");
        combo4.setEditable(true);
        
         Label end1 = new Label("End Date");
           ChoiceBox<String>level6 = new ChoiceBox<>();
        level6.getItems().addAll("January","Febuary","March","April","May","June","July","August","September"
        ,"October","November","December");
        level6.setValue("January");
        ComboBox<String> combo5 = new ComboBox<>();
        combo5.getItems().addAll("1991","1992","1993","1994","1995","1996","1997","1998","1999");
        combo5.setValue("1991");
        combo5.setEditable(true);
          CheckBox cb1 = new CheckBox("Do you still have this job");
          Button addjob = new Button("Add Another Job");
         Button backbutton2 = new Button("Back");
         Button nextbutton3 = new Button("Next");
         
         GridPane grid3 = new GridPane();
        grid3.setVgap(10);
        grid3.setHgap(10);
        GridPane.setConstraints(stat6,0,0);
        GridPane.setConstraints(job,0,1);
        GridPane.setConstraints(jobfield,1,1);
        GridPane.setConstraints(company1,0,2);
        GridPane.setConstraints(companynme,1,2);
        GridPane.setConstraints(town,0,3);
        GridPane.setConstraints(townfield,1,3);
        GridPane.setConstraints(placement,0,4);
        GridPane.setConstraints(level3,1,4);
        GridPane.setConstraints(addbutton2,2,5);
        GridPane.setConstraints(stat7,0,6);
        GridPane.setConstraints(jobti, 0, 7);
        GridPane.setConstraints(jobtifield,1,7);
        GridPane.setConstraints(companyname,0,8);
        GridPane.setConstraints(companyfield,1,8);
        GridPane.setConstraints(type,0,9);
        GridPane.setConstraints(level4,1,9);
        GridPane.setConstraints(jobdu,0,10);
        GridPane.setConstraints(jobdut,1,10);
        GridPane.setConstraints(start1,0,11);
        GridPane.setConstraints(level5,1,11);
        GridPane.setConstraints(combo4,2,11);
        GridPane.setConstraints(end1,0,12);
        GridPane.setConstraints(level6, 1,12 );
        GridPane.setConstraints(combo5,2,12);
        GridPane.setConstraints(cb1,3,12);
        GridPane.setConstraints(addjob,3,13);
        GridPane.setConstraints(backbutton2,0,14);
        GridPane.setConstraints(nextbutton3,3,14);
       
      grid3.getChildren().addAll(stat6,job,jobfield,company1,companynme,town,townfield,placement,level3,
              addbutton2,stat7,jobti,jobtifield,companyname,companyfield,type,level4,jobdu,jobdut,start1,
              level5,combo4,end1,level6,combo5,cb1,addjob,backbutton2,nextbutton3);
        Scene scene4 = new Scene(grid3,1000,600);
        backbutton2.setOnAction(e -> primaryStage.setScene(scene3));
      nextbutton2.setOnAction(e -> primaryStage.setScene(scene4));
      
      // scene 5
       Label refe = new Label("References");
          Label refna = new Label("Referee Name");
          TextField refnafield = new TextField();
         Label refcot = new Label("Referee Contact Details");
         TextArea refcotfield = new TextArea();
         Button addanref = new Button("Add Another Referee");
         Button backbutton3 = new Button("Back");
         Button priv = new Button("Preview");
        
        GridPane grid4 = new GridPane();
         grid4.setVgap(10);
        grid4.setHgap(10);
        GridPane.setConstraints(refe,0,0);
        GridPane.setConstraints(refna, 0, 1);
        GridPane.setConstraints(refnafield,1,1);
        GridPane.setConstraints(refcot,0,2);
        GridPane.setConstraints(refcotfield,1,2);
        GridPane.setConstraints(addanref,1,3);
        GridPane.setConstraints(backbutton3,0,4);
        GridPane.setConstraints(priv,1,4);
        grid4.getChildren().addAll(refe,refna,refnafield,refcot,refcotfield,addanref,backbutton3,priv);
        Scene scene5 = new Scene(grid4,700,400);
           backbutton3.setOnAction(e -> primaryStage.setScene(scene4));
           nextbutton3.setOnAction(e ->primaryStage.setScene(scene5));
           priv.setOnAction(e->PreviewPage.previewCv(firstnametextfield.getText(),middlenametextfield.getText(),lastnametextfield.getText(),
           emailfield.getText(),phonenofield.getText(),contactadd.getText(),personalstat1.getText(),keyskillfield.getText(),
           keyskillfield2.getText(),interesta.getText(),schoolfield.getText(),level1.getValue().toString(),combo1.getValue().toString(),
          level2.getValue().toString(),combo2.getValue().toString(),subjectfield.getText(),combo3.getValue().toString(),
          gradefield.getText(),jobfield.getText(),companynme.getText(),townfield.getText(),level3.getValue().toString(),
         jobtifield.getText(),companyfield.getText(),level4.getValue().toString(),jobdut.getText(),level5.getValue().toString(),
         combo4.getValue().toString(),level6.getValue().toString(),combo5.getValue().toString(),refnafield.getText(),refcotfield.getText()));
           
        primaryStage.setTitle("Cv Builder");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
