import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

public class GameGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load image
        Image image = new Image("file:Big Owl.jpg"); // Replace with your own image path
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);

        // Health label and text box
        Label healthLabel = new Label("Health: 100 / 100");

        TextField answerBox = new TextField();
        answerBox.setPromptText("Enter your answer..."); 
        
        Label label = new Label ("You are now in room One");

        // VBox for left side: image, health label, and text box
        VBox leftVBox = new VBox(5, imageView, label);
        leftVBox.setPadding(new Insets(10));

        // Right side: Start Over button
        Button startOverButton = new Button("Start Over");
        VBox rightVBox = new VBox(10, startOverButton, healthLabel, answerBox);
        rightVBox.setPadding(new Insets(10)); 
        

        // BorderPane layout
        BorderPane root = new BorderPane();
        root.setLeft(leftVBox);
        root.setRight(rightVBox);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Game GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

