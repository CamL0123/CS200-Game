
/**
 * Write a description of class Villain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Villain extends Animal {

    public Villain(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(getAnimalName() + " says: 'Welcome to your doom, human! I’ve been expecting you...'");
    }
}