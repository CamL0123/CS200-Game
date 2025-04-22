

/**
 * Write a description of class Room here.
 *
 * @Cameron Li
 * @version Feb6
 */
import java.util.ArrayList; 
public class Room
{
    String name;
    String description;
    boolean locked;
    Room nextRoom;
    Animal animal;

    public Room (String name, String description, boolean locked, Animal animal) {
        this.name = name;
        this.description = description;
        this.locked = locked;
        this.animal=animal;
    }
    
    public void setNextRoom(Room next) {
        this.nextRoom = next;
    }
    
    public Room getNextRoom() {
        return this.nextRoom;
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
