
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
    
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);  
    String answerA;
    String answerB;
    String answerC;
    answerA = "king cobra"; 
    answerB = "sand snake";
    answerC = "poisonous snake";
    // Riddle
    System.out.println("Snake Challenge: Riddle! Answer the following question and you will be able to open the door to the next room");
    System.out.println("Category is Snakes!!!");
    System.out.println("With scales that shimmer like jewels, I am a creature of beauty and danger. What am I?");
    System.out.println("A " + answerA);
    System.out.println("B " + answerB);
    System.out.println("C " + answerC);
    System.out.print("Enter your answer (e.g., A): ");

    String answer = scanner.nextLine().toUpperCase();

    if (answer.equals("A")) {
        System.out.println("Congratulations! You open the door to the next room.");
    } else {
        System.out.println("Wrong answer! Snake wants to bite you");
    }
        
    }

}
