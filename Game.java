import java.util.Scanner;
import java.util.ArrayList; 

/**
 * Welcome to the beginning of your adventure game project! Before you begin 
 * in this file, read the instructions in README.md. Make a copy of this file 
 * in your project folder on your machine, which you will use throughout the 
 * semester.
 * 
 * Instructions:
 * Follow the inline instructions, where tasks are marked by "TODO:". In this 
 * file, you will accept user input and split that input into a format that 
 * the computer can understand. This will occur continuously until the user 
 * enters "q".
 * 
 * Finally, write  a description of the class and update the author and version
 * tags.
 * 
 * Write a description of class Game here.
 * Game is a class that defines the rooms and players in the game.It accepts user input.
 *
 * @author Cameron Li
 * @version Spring 2025 April 21
 */
public class Game {
    
    Player p1;
    Room r0, r1, r2;
    
    
    public Game(){
        Animal snake=new Animal("Gigantic Snake");
        Animal owl=new Animal("Owl");
        Animal villain=new Animal("Human");
        
        
        // TODO: instantiate new objects for each of the four rooms r0, r1, r2, r3
        r0 = new Room("First Room", "The leftest room",true,snake);
        r1 = new Room("Second Room", "Room in the middle", true,owl);
        r2 = new Room("Final Room", "The rightest room", true, villain);
        
        // TODO: for each of the four rooms, add their neighbors using the setNeighbors() method for each one
        r0.setNeighbors(null, r1, null, null); 
        r1.setNeighbors(null, r2,null, r0); 
        r2.setNeighbors(null, null, null,r1); 
        
        
        p1 = new Player("player 1", "this is you!", r0);
        //System.out.println("You are starting in: "+p1.getLocation());
    }
    
    /**
     * A method to perform an action based on user input. 
     * You should not modify this method.
     * 
     * @param input - a String from the user's input command.
     */
    public void parseCommand(String input) {
        
        String[] wordList = input.split("[\s]");
        String verb;
        String noun;
        
        if(wordList.length < 2 || wordList.length > 2) {
            System.out.println("Only 2 word commands allowed!");
        } else {
            verb = wordList[0];
            noun = wordList[1];
            switch (verb) {
                case "go":
                    movePlayer(noun);
                    break;
                default:
                    System.out.println(verb + " is not a known verb!");
            }
        }
    }
    
    
        
}
