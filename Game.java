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
 * @version Spring 2025
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
        System.out.println("You are starting in: "+p1.getLocation());
        System.out.println("Welcome to the game! Where would you like to go?");
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
    
    public void movePlayer(String direction) {
        direction = direction.toLowerCase();
        Room currentRoom = p1.getLocation();
        
        Room nextRoom = null;
        switch (direction) {
            case "north":
               nextRoom = currentRoom.getN();
               break;
            case "south":
                nextRoom = currentRoom.getS();
                break;
            case "east":
                nextRoom = currentRoom.getE();
                break;
            case "west":
                nextRoom = currentRoom.getW();
                break;
            default:
            System.out.println("Unknown direction, player did not move.");
            return;
                
        }
        
        
        if (nextRoom != null) {
            p1.setLocation(nextRoom);
            System.out.println("You are now in: " + nextRoom);
                if (nextRoom.animal != null) {
                int damage = nextRoom.animal.getAnimalDamage();
                System.out.println("A " + nextRoom.animal.getAnimalName() + " attacked you!");
                p1.takeDamage(damage);
                System.out.println("Your health is now at " + p1.getHealth() + " points.");
            }else {
            System.out.println("The location you wish to go to is not valid!");
            System.out.println("You are now in: " + currentRoom); }
        }else {
            System.out.println("The location you wish to go to is not valid!");
        }    
    }
    
    public static void main(String[] args){
        Game gm = new Game();
        Scanner scan = new Scanner(System.in);
        String input = "";

        // TODO: write an introduction for your game that will be displayed to the user 
        // Let the user know what they can do and how to quit, the user quits by entering 'q'
        System.out.println("Or press q to quit.");
        while(!input.equals("q")) {
            input = scan.nextLine();
            if(input.equals("q")) {
                System.out.println("Thanks for playing!");
                break;
            }else{
                gm.parseCommand(input);
            }
        }
        scan.close();
    }
        
}
