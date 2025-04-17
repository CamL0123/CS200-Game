import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
/**
 * Write a description of class GameGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class GameGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load image
        Image image = new Image("file:Big O.jpg"); // Replace with your own image URL or file path
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);

        // Text box under the image
        TextField answerBox = new TextField();
        answerBox.setPromptText("Enter your answer...");

        // VBox for image + text box (stacked vertically)
        VBox leftVBox = new VBox(10, imageView, answerBox);
        leftVBox.setSpacing(10);

        // Buttons on the right
        Button northBtn = new Button("North");
        Button southBtn = new Button("South");
        Button eastBtn = new Button("East");
        Button westBtn = new Button("West");

        // VBox for right side buttons
        VBox rightVBox = new VBox(10, northBtn, southBtn, eastBtn, westBtn);
        rightVBox.setSpacing(10);

        // BorderPane layout
        BorderPane root = new BorderPane();
        root.setLeft(leftVBox);
        root.setRight(rightVBox);
        BorderPane.setMargin(leftVBox, new Insets(10));
        BorderPane.setMargin(rightVBox, new Insets(10));

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Game GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
