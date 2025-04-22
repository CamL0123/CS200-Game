
/**
 * Write a description of class Snake here.
 *
 * @Isabela Sanchez Taipe
 * @version 22/04/25
 */
import java.util.*;
import java.util.Scanner;

public class Snake extends Animal {
    // instance variables - replace the example below with your own
    // Constructor
    public Snake(){
        super("Snake", 10);
    }
    
        public String getRiddle() {
        return "Snake Challenge: Riddle! Answer the following question and you will be able to open the door to the next room"+
        "Category is Snakes!!!"+
        "With scales that shimmer like jewels, I am a creature of beauty and danger. What am I?"+
        "A: king cobra" +
        "B: sand snake" +
        "C: poisonous snake" +
        "Enter your answer (e.g., A): ";
    }
    
    public boolean playTruthGame(String answerString) {
        return answerString.equals("A");
    }
    
    public String correctString(){
        return "Congratulations! You're now getting to the next room.";
    }
    
    public String incorrectString(){
        return "Wrong answer! Snake wants to bite you";
    }

}
