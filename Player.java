/**
 * Write a description of class Room here.
 *
 * @Cameron Li
 * @version April 21
 */
import java.util.ArrayList; 
public class Player
{
    String description;
    String name;
    int health;
    Room location;
    
    public Player(String n) {
        this.description=d; 
        this.name=n;
        this.location=location;
        this.health=100; // Assuming default health is 100
        
    }
    
    // TODO: create a getter method for the name of the player
    public String getName(){
        return name;
    }
    
    // TODO: create a getter method for the location description of the player
    public String getDescription(){
        return description;
    }
    // TODO: create a getter method for the health of the player
    public int getHealth(){
        return health;
    }
    // TODO: create a setter method for the health of the player
    public void setHealth(int newHealth){
        health=newHealth;
    }
    
    public void takeDamage(int amount){
        int newHealth=((health-amount));
        setHealth(newHealth);
    }
    // TODO: create a setter method for the location of the player
    public void setLocation(Room newLocation){
        if (newLocation != null){
            location=newLocation;
        }
        else{
            System.out.println("The location you wish to go to is not valid!");
        }
    }
    // This method should check if the location is valid (not null) and print a message if it is not valid
 
    // TODO: create a getter method for the location of the player
    public Room getLocation(){
        return location;
    }
    // TODO: override the toString() to display the name of the current player
    @Override
    public String toString(){
        return name;
    }

    public void resetPlayer() {
        this.health = 100; // Reset health to 100
        this.location = new Room("room1", "Starting Room"); // Reset location to room0
    }

    public void movePlayertoRoom1(){
        Room room0 = new Room("room1", "Starting Room");
        this.setLocation(room1);
        System.out.println("You are in room1.");
    }

    public void movePlayertoRoom2(){
        Room room2 = new Room("room2", "Room 2");
        this.setLocation(room2);
        System.out.println("You are back to room2.");
    }

    public void movePlayertoRoom3(){
        Room room3 = new Room("room3", "Room 3");
        this.setLocation(room3);
        System.out.println("You are back to room3.");
    }
}    


