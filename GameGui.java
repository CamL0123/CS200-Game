/**
 * Write a description of class Room here.
 *
 * @Cameron Li
 * @version April 22
 */
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
import javafx.scene.input.KeyCode;

public class GameGui extends Application {
    
    private Game game;    
    
    @Override
    public void start(Stage primaryStage) {
        
        game = new Game();
        // Load image
        Image image = new Image("file:Big Owl.jpg"); // Replace with your own image path
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);

        // Health label and text box
        Label healthLabel = new Label("Health: 100 / 100");
        Label label = new Label ("You are now in room One");
        
        // Health label and text box
        Label riddle = new Label(game.getCurrentRoomRiddle());
        
        TextField answerBox = new TextField();
        
        answerBox.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){
                //if (answerBox.getText().equals("Something")){
                //    label.setText(answerBox.getText());
                //}
                Player player=game.getPlayer();
                Animal animal = game.getAnimal();
                if(animal instanceof Owl){
                    Owl o = (Owl)animal;
                    if(o.playTruthGame(answerBox.getText())){
                        label.setText(o.correctString());
                        game.movePlayerToNextRoom();
                        Image imageO = new Image("file:Big Owl.jpg");
                        imageView.setImage(imageO); 
                        riddle.setText(game.getCurrentRoomRiddle());
                    }else{
                        label.setText(o.incorrectString());
                        game.getPlayer().takeDamage(10);
                        healthLabel=new Label("Health" + player.getHealth()+"/100");
                    }
                }
                
                if (animal instanceof Snake){
                    Snake s = (Snake)animal;
                    if (s.playRiddle(answerBox.getText())){
                        label.setText(s.correctString());
                        game.movePlayerToNextRoom();
                        Image imageS = new Image("file: Big Snake.jpg");
                        riddle.setText(game.getCurrentRoomRiddle());
                    }else{
                        label.setText(s.incorrectString());
                        game.getPlayer().takeDamage(10);
                        healthLabel=new Label("Health" + player.getHealth()+"/100");
                    }
                }
                
                if (animal instanceof Villain){
                    Villain v=(Villain)animal;
                    if (v.ExitOrNot(answerBox.getText())){
                        label.setText(v.goBackString());//this method should return a string like "Haha sorry you're being sent back"
                        game.resetPlayer();
                    }else{
                        if (player.getHealth()>50){
                            label.setText(v.winningString());//this should be something like "fine! go! you win!"
                        }else{
                            label.setText(v.losingString());//something like "can't beat me!"
                            game.resetPlayer();
                        }
                    }
                }
            }
        });
        
        answerBox.setPromptText("Enter your answer..."); 


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
