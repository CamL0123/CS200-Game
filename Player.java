import java.util.ArrayList; 
public class Player
{
    String description;
    String name;
    int health;
    Room location;
    
    public Player(String d, String n, Room location) {
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

}    