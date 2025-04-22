

/**
 * Write a description of class Animal here.
 *
 * @CS200 Group
 * @version April 21
 */
public class Animal
{
    // instance variables - replace the example below with your own
    String name;
    int damage;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String name, int damage)
    {
        this.name= name;
        this.damage = damage;
    }

    public String getAnimalName(){
        return name;
    }    
    
    
    public int getAnimalDamage(){
        return damage;
    }
    
}
