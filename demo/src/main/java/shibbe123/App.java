package shibbe123;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[]args){
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        
        primaryStage.setTitle("Harry Potter Game");
        primaryStage.setWidth(840);
        primaryStage.setHeight(680);
       // primaryStage.setX(50);
        //primaryStage.setY(50);
        primaryStage.setFullScreen(true);

        Text text = new Text();
        text.setText("WELCOME TO THE GAME OF HARRY POTTER");
        text.setX(170);
        text.setY(100);
        text.setFont(Font.font("Times New Roman", 50));
        text.setFill(Color.CRIMSON);

        Button button1 = new Button();
        button1.setText("PLAY");
        button1.setLayoutX(600);
        button1.setLayoutY(250);
        button1.setFont(Font.font("Times New Roman", 50));
        //button1.setStyle("-fx-background-color: white;  -fx-border: 2px solid #4CAF50; -fx- padding: 16px 32px; -fx- cursor: pointer;");









        root.getChildren().add(text);
        root.getChildren().add(button1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

}