
/**
 * Write a description of class Snake here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        return "Snake Challenge: Riddle! Answer the following question and you will be able to open the door to the next room\n"+
        "Category is Snakes!!!\n"+
        "With scales that shimmer like jewels, I am a creature of beauty and danger. What am I?\n"+
        "A: king cobra\n" +
        "B: sand snake\n" +
        "C: poisonous snake\n" +
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