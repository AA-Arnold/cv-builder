package Imagedemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application; 
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group; 
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.FileChooser;
import javafx.stage.Stage;  
import javax.imageio.ImageIO;

public class ImageExample extends Application{  
    static FileChooser fileChooser;
    static File filePath;
   @Override 
   public void start(Stage stage) throws FileNotFoundException {   
       
        Button generate = new Button("Generate");
        generate.setOnAction((event) -> {
            Stage stage1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            fileChooser=new FileChooser();
            fileChooser.setTitle("open image");
            filePath = fileChooser.showOpenDialog(stage1);
            try {
                BufferedImage bufferimage = ImageIO.read(filePath);
                Image image =SwingFXUtils.toFXImage(bufferimage,null);
                System.out.println(bufferimage.toString());
            } catch (Exception e) {
                System.out.println("error at = "+ e);
            }
        });
       
      //Creating an image 
      
      Image image = new Image(new FileInputStream("C:\\Users\\Adoye\\Pictures\\Screenshots\\Screenshot (30).png"));  
      //Setting the image view 
      ImageView imageView = new ImageView(image); 
      imageView.getOnDragDropped(); 
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(455); 
      imageView.setFitWidth(500); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      Group root = new Group(imageView,generate);  
      
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 500);  
      
      //Setting title to the Stage 
      stage.setTitle("Loading an image");  
      
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   
   public void img(ActionEvent event){
       Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       
       fileChooser=new FileChooser();
       fileChooser.setTitle("open image");
       
       this.filePath=fileChooser.showOpenDialog(stage);
   }
   public static void main(String args[]) { 
      launch(args); 
   } 

   
}