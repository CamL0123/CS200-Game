//For villain game: villain's name in the game is "Human" for game purposes, 
//while its subclass name is villain.Villain asks if the player wants to leave, 
//if player says "yes" player starts from room0. if player says "no", player fights the villain. 
//the player wins if the player has more than 50 health points left, else starts over from room0.

import java.util.*;

public class Villain extends Animal {
    public Villain(Player player) {
        super("Human", 50); // Name is "Human" as per your comment
    }
    
    public boolean exitOrNot(boolean answer) {
        // Get the player from the current room
        Player player = null;
        // This would ideally be obtained from the game controller
        // or passed as a parameter
        
        if (answer) { // If player wants to leave
            System.out.println("You chose to leave. Wise decision.");
            player.resetPlayer();
            System.out.println("You are back to room0.");
            return false;
        } else { // If player wants to fight
            System.out.println("OK. Let's start a fight");
            player.takeDamage(50);
            System.out.println("You have " + player.getHealth() + " health points left.");
            
            if (player.getHealth() > 50) {
                System.out.println("You win! You have more than 50 health points left.");
                return true;
            } else {
                System.out.println("You lose! You have less than 50 health points left.");
                player.resetPlayer();
                System.out.println("You are back to room0.");
                return false;
            }
        }
    }
}
