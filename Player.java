/**
 * Write a description of class Room here.
 *
 * @Cameron Li
 * @version April 21
 */
import java.util.ArrayList; 

public class Player {
    private String description;
    private String name;
    private int health;
    private Room location;
    
    // Adding no-argument constructor
    public Player() {
        this("Default Player");
    }
    
    public Player(String n) {
        this.description = "A brave adventurer"; 
        this.name = n;
        this.health = 100;
        // Initialize with a default room - need to pass null for animal since we don't have one yet
        this.location = new Room("room0", "Starting Room", false, null);
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int newHealth) {
        health = newHealth;
    }
    
    public void takeDamage(int amount) {
        int newHealth = health - amount;
        setHealth(newHealth);
    }
    
    public void setLocation(Room newLocation) {
        if (newLocation != null) {
            location = newLocation;
        } else {
            System.out.println("The location you wish to go to is not valid!");
        }
    }
 
    public Room getLocation() {
        return location;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public void resetPlayer() {
        this.health = 100;
        // Reset to room0 with no animal
        this.location = new Room("room0", "Starting Room", false, null);
    }
    
    public void movePlayertoRoom1() {
        // Create a Snake for room1
        Snake snake = new Snake();
        Room room1 = new Room("room1", "Room with a Snake", false, snake);
        this.setLocation(room1);
        System.out.println("You are in room1.");
    }
    
    public void movePlayertoRoom2() {
        // Create an Owl for room2
        Owl owl = new Owl();
        Room room2 = new Room("room2", "Room with an Owl", false, owl);
        this.setLocation(room2);
        System.out.println("You are back to room2.");
    }
    
    public void movePlayertoRoom3() {
        // For room3, create a Villain
        Villain villain = new Villain(this); // Pass 'this' player to the villain
        Room room3 = new Room("room3", "Room with a Villain", false, villain);
        this.setLocation(room3);
        System.out.println("You are back to room3.");
    }
}


