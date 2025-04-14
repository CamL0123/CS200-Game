

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
    Room n, e, s, w;
    Animal animal;
    //ArrayList<Treasure> treasureChest;

    public Room (String name, String description, boolean locked, Animal animal) {
        this.name = name;
        this.description = description;
        this.locked = locked;
        this.animal=animal;
        //this.treasureChest=new ArrayList<>();
    }
    
    public void setNeighbors(Room n, Room e, Room s, Room w){
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
    }
    
    public Room getN() {
        return n;
    }
    
    public Room getE() {
        return e;
    }
    
    public Room getS() {
        return s;
    }
    
    public Room getW() {
        return w;
    }
    
    // TODO: override the toString() to display the name and description of the room
    @Override
    public String toString() {
        return name + ": " + description;
    }
    
}
