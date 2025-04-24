//For villain game: villain's name in the game is "Human" for game purposes, 
//while its subclass name is villain.Villain asks if the player wants to leave, 
//if player says "yes" player starts from room0. if player says "no", player fights the villain. 
//the player wins if the player has more than 50 health points left, else starts over from room0.

import java.util.*;

public class Villain extends Animal {
    private Player player;
    
    public Villain() {
        super("Human", 50); // Using "Villain" as the name
        this.player = player; // Save the player reference
    }
    public String getQuestion() {
        return "The villain appears, and asks you 'do you want to leave?'";
    }
    
    /**
     * Determines if the player wants to exit or fight
     * @param answer The player's text input
     * @return true if player wants to exit, false if they want to fight
     */
    public boolean exitOrNot(String answer) {
        // Process player's text response
        String lowerAnswer = answer.toLowerCase().trim();
        
        // Check if answer indicates exit (yes, exit, leave, retreat)
        boolean wantsToExit = lowerAnswer.contains("yes") || 
                             lowerAnswer.contains("exit") || 
                             lowerAnswer.contains("leave") ||
                             lowerAnswer.contains("retreat");
        
        return wantsToExit;
    }
    
    /**
     * Returns a message when the player decides to go back rather than fight
     * @return A string message for when the player retreats
     */
    public String goBackString() {
        return "You wisely choose to retreat. You return to the first room.";
    }
    
    /**
     * Returns a message when the player defeats the villain
     * @return A string message for when the player wins the fight
     */
    public String winningString() {
        return "You've figured out it's a trick! Villain will not let you go unless you fight. You defeated the villain! You can continue your journey.";
    }
    
    /**
     * Returns a message when the villain defeats the player
     * @return A string message for when the player loses the fight
     */
    public String losingString() {
        return "You've figured out it's a trick! Villain will not let you go unless you fight. The villain was too strong! You have been defeated and sent back to the beginning.";
    }
}
