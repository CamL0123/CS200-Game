

/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    String name;
    int damage;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String name)
    {
        this.name=name;
    }

    public String getAnimalName(){
        return name;
    }
        public int getAnimalDamage(){
        return damage;
    }
    
}
