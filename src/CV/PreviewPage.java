package CV;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PreviewPage {
    public static void previewCv(String firstname,String middlename,String lastname, String email,String phoneno
    ,String contactaddress,String personalstat,String keyskill1,String keyskill2,String interest,String collegename,
   String startmonth,String startyear, String endmonth,String endyear,String subject,String quali,
    String grade,String jobtitle,String companyname,String town1,String placement,String jobtitle1,String companyname1,
    String typeofwork,String jobduties,String startmonth1,String startyear1,String endmonth1,String endyear1,
    String refname,String refedetails){
     Stage stage=new Stage();
     Label statement = new Label("Preview of CV");
     Label firststate = new Label("Personal Details");
     Label firstName = new Label("FirstName:");
     Label firstnamefield  = new Label(firstname);
     Label MiddleName = new Label("MiddleName:");
     Label middlenamefield = new Label(middlename);
     Label Lastname = new Label("LastName:");
     Label lastnamefield = new Label(lastname);
     Label  contactAddress = new Label("Contact Address:");
     Label contaddfield = new Label(contactaddress);
     Label phoneNo = new Label("Phone No:");
     Label phonenofield = new Label(phoneno);
     Label secondstate = new Label("Personal Profile");
     Label personalstate = new Label("Personal Statement:");
     Label personalstatefield = new Label(personalstat);
     Label keyskills = new Label ("Keyskills:");
     Label keyskills1 = new Label (keyskill1);
     Label keyskills2 = new Label(keyskill2);
     Label interestsaa = new Label("Interests And Achievements:");
     Label interests = new Label (interest);
     Label thirdstate = new Label("Education");
     Label collegename1 = new Label("College Name:");
     Label collegeuniname = new Label(collegename);
    
     Label startingdate = new Label("Start Date:");
     Label startingmonth = new Label(startmonth);
     Label startingyear = new Label(startyear);
     Label endingdate = new Label("End Date:");
     Label endingmonth = new Label(endmonth);
     Label endingyear = new Label(endyear);
     Label fourth = new Label("Qualifications");
     Label gradsubject = new Label("Subject:");
     Label gradsubjectlabel = new Label(subject);
     Label qualifications = new Label("Qualification Type:");
     Label qualification = new Label(quali);
     Label grades = new Label("Grade:");
     Label gradGrade = new Label(grade);
     Label statement1 = new Label("Work Experience Placement");
     Label jobTitle = new Label("Job Title:");
     Label jobtitlefield = new Label(jobtitle);
     Label companynamelabel = new Label("Company Name:");
     Label companynamefield = new Label(companyname);
     Label companytown = new Label("Town:");
     Label companytownfield = new Label(town1);
     Label companyplacement = new Label("Placement:");
     Label companyplacementfield = new Label(placement);
     Label statement2 = new Label("Work History");
     Label jobTitle2 = new Label("Job Title:");
     Label jobtitlefield2 = new Label(jobtitle1);
     Label companynamelabel1 = new Label("Company Name:");
     Label companynamefield1 = new Label(companyname1);
     Label typeofworklabel = new Label("Type Of Work:");
     Label typeofworkfield = new Label(typeofwork);
     Label jobdutieslabel = new Label("Job Duties And Responsibilties:");
     Label jobdutiesfield = new Label(jobduties);
     Label startinglabel1 = new Label("Start Date:");
     Label startingmonthfield = new Label(startmonth1);
     Label startingyearfield = new Label(startyear1);
     Label statement3 = new Label("References");
     Label refername = new Label("Reference Name:");
     Label refernamefield  = new Label(refname); 
     Label refcontact = new Label("Reference Contact Details:");
     Label refcontactfield = new Label(refedetails);
     Button backbutton = new Button("Back");
     Button savebutton = new Button("Save");
     
      GridPane grid=new GridPane();
       grid.setVgap(10);
       grid.setHgap(10);
       
       GridPane.setConstraints(statement,0,0);
       GridPane.setConstraints(firststate,0,1);
       GridPane.setConstraints(firstName,0,2);
       GridPane.setConstraints(firstnamefield,1,2);
      GridPane.setConstraints(MiddleName,0,3);
      GridPane.setConstraints(middlenamefield,1,3);
      GridPane.setConstraints(Lastname,0,4);
      GridPane.setConstraints(lastnamefield,1,4);
      GridPane.setConstraints(contactAddress,0,5);
       GridPane.setConstraints(contaddfield,1,5);
        GridPane.setConstraints(phoneNo,0,6);
        GridPane.setConstraints(phonenofield,1,6);
        GridPane.setConstraints(secondstate,0,7);
         GridPane.setConstraints(personalstate,0,8);
         GridPane.setConstraints(personalstatefield,1,8);
          GridPane.setConstraints(keyskills,0,9);
          GridPane.setConstraints(keyskills1,1,9);
           GridPane.setConstraints(keyskills2,2,9);
            GridPane.setConstraints(interestsaa,0,10);
             GridPane.setConstraints(interests,1,10);
             GridPane.setConstraints(thirdstate,0,11);
        GridPane.setConstraints(collegename1,0,12);
          GridPane.setConstraints(collegeuniname,1,12);
         
          GridPane.setConstraints(startingdate,0,14);
            GridPane.setConstraints(startingmonth,1,14);
         GridPane.setConstraints(startingyear,2,14);
         GridPane.setConstraints(endingdate,0,15);
         GridPane.setConstraints(endingmonth,1,15);
          GridPane.setConstraints(endingyear,2,15);
         GridPane.setConstraints(fourth,0,16);
          GridPane.setConstraints(gradsubject,0,17);
            GridPane.setConstraints(gradsubjectlabel,1,17);
           GridPane.setConstraints(qualifications,0,18);
            GridPane.setConstraints(qualification,1,18);
           GridPane.setConstraints(grades,0,19); 
           GridPane.setConstraints(gradGrade,1,19);
           GridPane.setConstraints(statement1,0,20);
           GridPane.setConstraints(jobTitle,0,21);
           GridPane.setConstraints(jobtitlefield,1,21);
           GridPane.setConstraints(companynamelabel,0,22);
           GridPane.setConstraints(companynamefield,1,22);
           GridPane.setConstraints(companytown,0,23);
            GridPane.setConstraints(companytownfield,1,23);
            GridPane.setConstraints(companyplacement,0,24);
            GridPane.setConstraints(companyplacementfield,1,24);
            GridPane.setConstraints(statement2,0,25);
            GridPane.setConstraints(jobTitle2,0,26);
            GridPane.setConstraints(jobtitlefield2,1,26);
            GridPane.setConstraints(companynamelabel1,0,27);
            GridPane.setConstraints(companynamefield1,1,27);
            GridPane.setConstraints(typeofworklabel,0,28);
            GridPane.setConstraints(typeofworkfield,1,28);
            GridPane.setConstraints(jobdutieslabel,0,29);
            GridPane.setConstraints(jobdutiesfield,0,30);
            GridPane.setConstraints(startinglabel1,0,31);
            GridPane.setConstraints(startingmonthfield,1,31);
            GridPane.setConstraints(startingyearfield,2,31);
            GridPane.setConstraints(statement3,0,32);
            GridPane.setConstraints(refername,0,33);
            GridPane.setConstraints(refernamefield,1,33);
            GridPane.setConstraints(refcontact,0,34);
            GridPane.setConstraints(refcontactfield,1,34);
            GridPane.setConstraints(backbutton,0,35);
            GridPane.setConstraints(savebutton,1,35);
            
            grid.getChildren().addAll(statement,firststate,firstName,firstnamefield,MiddleName,middlenamefield,
                  Lastname,lastnamefield, contactAddress,contaddfield,phoneNo,phonenofield, secondstate,personalstate,
                 personalstatefield,keyskills,keyskills1,keyskills2,interestsaa,interests,thirdstate,collegename1,collegeuniname,
                 startingdate,startingmonth,startingyear,endingdate,endingmonth,endingyear,fourth,gradsubject,
                 gradsubjectlabel,qualifications,grades,gradGrade,statement1,jobTitle,jobtitlefield,companynamelabel,companynamefield,
                 companytown,companytownfield,companyplacement,companyplacementfield,statement2,jobTitle2,jobtitlefield2,
                 companynamelabel1,companynamefield1,typeofworklabel,typeofworkfield,jobdutieslabel,jobdutiesfield,startinglabel1,
                 startingyearfield,statement3,refername,refernamefield,refcontact,refcontactfield,backbutton,
                savebutton );
            
              
    Scene scene=new Scene(grid,1000,500);
        
        
        stage.setScene(scene);
        stage.setTitle("CV Builder");
        stage.show();
    }
}



//  
//                               ,
//                               ,,
//                              