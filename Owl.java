import java.util.*;

public class Owl extends Animal {
    
    // We haven't talked about private classes, don't use this
    // Only use the concepts that we have talked about
    // Make a separate class for this
    private static class FactSet {
        String A, B, C;
        String[] truths;

        FactSet(String A, String B, String C, String truth1, String truth2) {
            this.A = A;
            this.B = B;
            this.C = C;
            this.truths = new String[]{truth1, truth2};
        }
    }

    private ArrayList<FactSet> factSets;
    private FactSet set;

    public Owl() {
        super("Owl", 10); // You can define Owl damage value here
        factSets = new ArrayList<>();

        // Example sets
        factSets.add(new FactSet("Owls can rotate their heads 270°.", "Owls are mammals.", "Owls hunt at night.", "A", "C"));
        factSets.add(new FactSet("Owls have excellent vision.", "Owls can swim long distances.", "Owls regurgitate bones.", "A", "C"));
        factSets.add(new FactSet("Owls lay eggs.", "Owls build nests underground.", "Owls have asymmetrical ears.", "A", "C"));
        factSets.add(new FactSet("The Great Wall of China is visible from space.", "Water boils at a lower temperature at higher altitudes.", "Bananas are berries, but strawberries are not.", "B", "C"));
        factSets.add(new FactSet("Lightning can strike the same place twice.", "Humans share 98% of their DNA with chimpanzees.", "The Sahara Desert is the largest desert in the world.", "A", "B"));
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