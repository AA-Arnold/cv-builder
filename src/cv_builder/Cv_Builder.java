package cv_builder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Cv_Builder extends Application {

    static TextField firstNF, lastNF, emailF, contactF, cityF, addrsF, aboutF, skill0, skill1,
            skill2, skill3, comF, deptF, comF2, deptF2, jsceF, ssceF ,bsceF;
    static ComboBox<String> nationl, statel,sex1;
    RadioButton rdb, rdb1;
    static DatePicker d;
    Scene scene, scene2;

    @Override
    public void start(Stage primaryStage) {

        //Header
        Label head = new Label("PERSONAL");
        head.setStyle("-fx-font-family:monospace;-fx-font-size:20px;-fx-underline:true");
        

        //first Name and field
        Label firstN = new Label("First Name : ");
        firstNF = new TextField();
        firstNF.setPromptText("Enter First Name");

        //Last Name and field
        Label lastN = new Label("Last Name : ");
        lastNF = new TextField();
        lastNF.setPromptText("Enter Last Name");

        //Email and field
        Label email = new Label("Email : ");
        emailF = new TextField();
        emailF.setPromptText("Enter Email address");

        //Contact and field
        Label contact = new Label("Contact : ");
        contactF = new TextField();
        contactF.setPromptText("Enter Contact Details");

        //Date of Birth
        Label dob = new Label("Date-of-Birth");
        d = new DatePicker();

        //state of origin 
        Label state = new Label("State-of-origin : ");
        statel = new ComboBox<>();
        statel.getItems().addAll("Imo", "Anambra", "Edo", "Kogi", "Ondo");
        statel.setEditable(true);
        statel.setValue("Imo");
        

        //City and field
        Label city = new Label("City : ");
        cityF = new TextField();
        cityF.setPromptText("Enter Your City");

        //nationality 
        Label nation = new Label("Nationality : ");
        nationl = new ComboBox<>();
        nationl.getItems().addAll("Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua &amp; Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas",
                 "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia &amp; Herzegovina", "Botswana", "Brazil", "British Virgin Islands",
                 "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Chad", "Chile", "China", "Colombia", "Congo", "Cook Islands", "Costa Rica",
                 "Cote D Ivoire", "Croatia", "Cruise Ship", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea",
                 "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia", "French West Indies", "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
                 "Gibraltar", "Greece", "Greenland", "Grenada", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "India",
                 "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kuwait", "Kyrgyz Republic", "Laos", "Latvia",
                 "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Mauritania",
                 "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Namibia", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia",
                 "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal",
                 "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda", "Saint Pierre &amp; Miquelon", "Samoa", "San Marino", "Satellite", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
                 "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "South Africa", "South Korea", "Spain", "Sri Lanka", "St Kitts &amp; Nevis", "St Lucia", "St Vincent", "St. Lucia", "Sudan",
                 "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor L'Este", "Togo", "Tonga", "Trinidad &amp; Tobago", "Tunisia",
                 "Turkey", "Turkmenistan", "Turks &amp; Caicos", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay",
                 "Uzbekistan", "Venezuela", "Vietnam", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe");
        nationl.setValue("Spain");

        //Address and field
        Label addrs = new Label("Address : ");
        addrsF = new TextField();
        addrsF.setPromptText("Enter address Details");
        addrsF.setPadding(new Insets(10));

        //Radio Selection
        Label sex = new Label("Gender : ");
        sex1 = new ComboBox<>();
        sex1.getItems().addAll("MALE", "FEMALE");
        sex1.setValue("FEMALE");
        
        //About and field
        Label about = new Label("About : ");
        aboutF = new TextField();
        aboutF.setPromptText("Write Something About Yourself");
        aboutF.setPadding(new Insets(17));

        //Skills header
        Label skill = new Label("PROFESSIONAL SKILLS");
        skill.setStyle("-fx-font-family:monospace;-fx-underline:true");

        //skill box 1
        skill0 = new TextField();
        skill0.setPromptText("skill set");

        //skill box 1
        skill1 = new TextField();
        skill1.setPromptText("skill set");

        //skill box 1
        skill2 = new TextField();
        skill2.setPromptText("skill set");

        //skill box 1
        skill3 = new TextField();
        skill3.setPromptText("skill set");

        //previous jobs
        Label pw = new Label("PREVIOUS JOBS");
        pw.setStyle("-fx-font-family:monospace;-fx-underline:true");

        //company name and field
        Label com = new Label("Company Attached To: ");
        comF = new TextField();
        comF.setPromptText("Enter Previous work place");

        //department
        Label dept = new Label("Department : ");
        deptF = new TextField();
        deptF.setPromptText("Department Section");

        //company name and field
        Label com2 = new Label("Company Attached To: ");
        comF2 = new TextField();
        comF2.setPromptText("Enter Previous work place");

        //department
        Label dept2 = new Label("Department : ");
        deptF2 = new TextField();
        deptF2.setPromptText("Department Section");

        //Qualification header
        Label quals = new Label("QUALIFICATION");
        quals.setStyle("-fx-font-family:monospace;"
                + "-fx-font-size:20px;-fx-underline:true");

        //JSCE
        Label jsce = new Label("Primary Certificate: ");
        jsceF = new TextField();
        jsceF.setPromptText("Junior Certificate Credential");

        //SSCE
        Label ssce = new Label("Secondary Certificate: ");
        ssceF = new TextField();
        ssceF.setPromptText("Secondary Certificate Credential");

        //BSCE
        Label bsce = new Label("Tertiary Certificate: ");
        bsceF = new TextField();
        bsceF.setPromptText("Bachelor Certificate Credential");

        //button 
        Button generate = new Button("Generate CV");
        CvFn btn = new CvFn();
        generate.setStyle("-fx-background-color: #00FF6F;");
        generate.setOnAction((e) -> {
            btn.btn();
            toggle();
        });

        Button preview = new Button("Preview CV");
        preview.setStyle("-fx-background-color: #474C8F;");
        preview.setOnAction( (e) -> CvPreview.preview(firstNF.getText(),lastNF.getText(),emailF.getText(),contactF.getText(),d.getValue().toString(),
                                                      statel.getValue(),cityF.getText(),nationl.getValue(),addrsF.getText(),sex1.getValue(),aboutF.getText(),
                                                      skill0.getText(),skill1.getText(),skill2.getText(),skill3.getText(),comF.getText(), deptF.getText(),
                                                      comF2.getText(),deptF2.getText(),jsceF.getText(),ssceF.getText(),ssceF.getText()));
        
//        ,
//                                                      ,
//                                                      
//                                                     
//                                                      
 
        Button clear = new Button("Clear ");
        
        clear.setOnAction((e) -> {
            
        });

        GridPane grid = new GridPane();
        grid.setStyle("-fx-grid-lines-visible:true");
//        grid.setStyle("-fx-background-color: blue;");
        grid.setStyle("-fx-background-color:#ADC9FF;-fx-background: linear-gradient(#ffffff 50%, rgba(255,255,255,0) 0) 0 0,radial-gradient(circle closest-side, #FFFFFF 53%, rgba(255,255,255,0) 0) 0 0,radial-gradient(circle closest-side, #FFFFFF 50%, rgba(255,255,255,0) 0) 55px 0 #48B;background-size: 110px 200px;background-repeat: repeat-x;");
        grid.setVgap(10);
        grid.setHgap(10);

        //head
        GridPane.setConstraints(head, 3, 6);

        //firstname position
        GridPane.setConstraints(firstN, 3, 7);
        GridPane.setConstraints(firstNF, 7, 7);

        //lastname position
        GridPane.setConstraints(lastN, 3, 8);
        /*GridPane.setConstraints(lastNF, 14, 7);next column sample*/
        GridPane.setConstraints(lastNF, 7, 8);

        //Email position
        GridPane.setConstraints(email, 3, 9);
        GridPane.setConstraints(emailF, 7, 9);

        //contact  position
        GridPane.setConstraints(contact, 3, 10);
        GridPane.setConstraints(contactF, 7, 10);

        //date of birth  position
        GridPane.setConstraints(dob, 3, 11);
        GridPane.setConstraints(d, 7, 11);

        //state of origin position
        GridPane.setConstraints(state, 3, 12);
        GridPane.setConstraints(statel, 7, 12);

        //City position
        GridPane.setConstraints(city, 3, 13);
        GridPane.setConstraints(cityF, 7, 13);

        //Nationality position
        GridPane.setConstraints(nation, 3, 14);
        GridPane.setConstraints(nationl, 7, 14);

        //Address position
        GridPane.setConstraints(addrs, 3, 15);
        GridPane.setConstraints(addrsF, 7, 15);

        //gender position
        GridPane.setConstraints(sex, 3, 16);
        GridPane.setConstraints(sex1, 7, 16);
//        GridPane.setConstraints(rdb1, 7, 17);

        //About position
        GridPane.setConstraints(about, 3, 18);
        GridPane.setConstraints(aboutF, 7, 18);

        //skill head position
        GridPane.setConstraints(skill, 16, 6);

        //skill box1-box4
        GridPane.setConstraints(skill0, 16, 7);
        GridPane.setConstraints(skill1, 17, 7);
        GridPane.setConstraints(skill2, 16, 8);
        GridPane.setConstraints(skill3, 17, 8);

        //previous work position
        GridPane.setConstraints(pw, 16, 11);

        //previous work details
        GridPane.setConstraints(com, 16, 12);
        GridPane.setConstraints(comF, 17, 12);

        //department position
        GridPane.setConstraints(dept, 16, 13);
        GridPane.setConstraints(deptF, 17, 13);

        //previous work details
        GridPane.setConstraints(com2, 16, 15);
        GridPane.setConstraints(comF2, 17, 15);

        //department position
        GridPane.setConstraints(dept2, 16, 16);
        GridPane.setConstraints(deptF2, 17, 16);

        //qualification position
        GridPane.setConstraints(quals, 3, 20, 20, 3);

        //jsce position
        GridPane.setConstraints(jsce, 3, 23);
        GridPane.setConstraints(jsceF, 7, 23);

        //ssce position
        GridPane.setConstraints(ssce, 3, 24);
        GridPane.setConstraints(ssceF, 7, 24);

        //bsce position
        GridPane.setConstraints(bsce, 3, 25);
        GridPane.setConstraints(bsceF, 7, 25);

        // btn position
        GridPane.setConstraints(generate, 17, 22);
//        GridPane.setConstraints(clear, 21, 22);
        GridPane.setConstraints(preview, 17, 23);

        grid.getChildren().addAll(firstNF, firstN, lastN, lastNF, email, emailF, contact,
                contactF, dob, d, state, statel, city, cityF, nation, nationl, addrs, addrsF,
                sex, sex1, about, aboutF, head, skill, skill0, skill1, skill2, skill3, pw,
                com, comF, dept, deptF, com2, comF2, dept2, deptF2, quals, jsce, jsceF, ssce,
                ssceF, bsce, bsceF, generate,  preview);

        Scene scene = new Scene(grid, 900, 700);
//        scene.getStylesheets().add("file:style.css");
//        scene.getStylesheets().add(getClass().getResource("style.css").toString());

        primaryStage.setTitle("CV BUILDER");
        primaryStage.setScene(scene);
        primaryStage.show();

        /*-------------------------Second Scene ------------------------------*/
    }

    public void toggle() {
        if (rdb.isSelected()) {
            System.out.println("Male");
        } else if (rdb1.isSelected()) {
            System.out.println("Female");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    //create preview mode of how the template will look like
    //from there generate user information
    //must determine control flow of the statement
    //try to use seprated classes
}
