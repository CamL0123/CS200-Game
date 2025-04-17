/For villain game: villain's name in the game is "Human" for game purposes, 
//while its subclass name is villain.Villain asks if the player wants to leave, 
//if player says "yes" player starts from room0. if player says "no", player fights the villain. 
//the player wins if the player has more than 50 health points left, else starts over from room0.

import java.util.*;

public class Villain extends Animal {
    public Villain() {
        super("Villain", 50); 
        }

    public boolean ExitOrNot(boolean answer){
        if (answer) {
            System.out.println("OK. Let's start a fight");

        } else {
            System.out.println("Haha. You are not strong enough to fight me. I will let you go this time.");
            System.out.println("But remember, I will be back!");
            // Player starts from room0. need a method in Player class to reset the player's health points to 100, and reset the player's position to room0.
            // Assuming Player class has a method resetPlayer() to reset health and position
            Player player = new Player();
            player.resetPlayer();
            System.out.println("You are back to room0.");
        }

        return correct;
    }
}
