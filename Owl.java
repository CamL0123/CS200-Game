import java.util.*;

public class Owl extends Animal {
    private List<FactSet> factSets;

    public Owl() {
    super("Owl", 10);
    factSets = FactSet.getOwlFactSets(); 
    }

    public String getRiddle() {
        Random rand = new Random();
        set = factSets.get(rand.nextInt(factSets.size()));

        String riddle = "🦉 Owl Challenge: Two Truths and a Lie! Choose the two true statements.\n"+
        "A. " + set.A+"\n"+
        "B. " + set.B+"\n"+
        "C. " + set.C+"\n"+
        "Enter your two choices (e.g., AB): ";
        return riddle;
    }

    public boolean playTruthGame(String answerString) {

        return answerString.contains(set.truths[0]) && answerString.contains(set.truths[1]) && answerString.length() == 2;

        /*if (correct) {
            System.out.println("Congratulations! You're now getting to the next room.");
            movePlayertoRoom3();
        } else {
            System.out.println("Wrong answer! The Owl is not amused...");
            System.out.println("The correct answers were: " + set.truths[0] + " and " + set.truths[1]);
            System.out.println("You lose 10 health points.");
            Player player = new Player();
            player.takeDamage(10);
            System.out.println("You have " + player.getHealth() + " health points left.");
            if (player.getHealth() <= 0) {
                System.out.println("Game over! You have no health left.");
                // Reset player or end game
                System.out.println("You are back to room0.");
                player.resetPlayer();
            }
            else{
                movePlayertoRoom2();
            }
            
        }*/
    }
    
    public String correctString(){
        return "Congratulations! You're now getting to the next room.";
    }
    
    public String incorrectString(){
        return "Wrong answer! The Owl is not amused...\n"+
                        "The correct answers were: " + set.truths[0] + " and " + set.truths[1]+"\n"+
                        "You lose 10 health points.";
    }
}
