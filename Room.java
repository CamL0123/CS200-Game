/**
 * Write a description of class Room here.
 *
 * @Cameron Li
 * @version april 21 modified room names
 */
import java.util.ArrayList; 
public class Room
{
    String name;
    String description;
    boolean locked;
    Room room1, room2, room3;
    Animal animal;

    public Room (String name, String description, boolean locked, Animal animal) {
        this.name = name;
        this.description = description;
        this.locked = locked;
        this.animal=animal;
    }
    
    public void setNeighbors(Room room1, Room room2, Room room3){
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }
    
    public Room getOneRoom() {
        return room1;
    }
    
    public Room getTwoRoom() {
        return room2;
    }
    
    public Room getThreeRoom() {
        return room3;
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    // TODO: override the toString() to display the name and description of the room
    @Override
    public String toString() {
        return name + ": " + description;
    }
    
}
