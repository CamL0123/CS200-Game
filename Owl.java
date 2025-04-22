import java.util.*;

public class Owl extends Animal {
    private List<FactSet> factSets;

    public Owl() {
    super("Owl", 10);
    factSets = FactSet.getOwlFactSets(); 
    }

    public String playTruthGame(String answerString, Player player) {
        Random rand = new Random();
        FactSet set = factSets.get(rand.nextInt(factSets.size()));

        StringBuilder output = new StringBuilder();
        output.append("Owl Challenge: Two Truths and a Lie! Choose the two true statements.\n");
        output.append("A. ").append(set.A).append("\n");
        output.append("B. ").append(set.B).append("\n");
        output.append("C. ").append(set.C).append("\n");

        String answer = answerString.toUpperCase();

        boolean correct = answer.contains(set.truths[0]) && answer.contains(set.truths[1]) && answer.length() == 2;

        if (correct) {
            output.append("Correct! You're now getting to the next room.");
        } else {
            output.append("Wrong answer! The Owl is not amused...\n");
            output.append("The correct answers were: ").append(set.truths[0]).append(" and ").append(set.truths[1]).append("\n");
            player.takeDamage(super.getDamage());
            output.append("You lose ").append(super.getDamage()).append(" health points.\n");
            output.append("You now have ").append(player.getHealth()).append(" health points.\n");
            if (player.getHealth() <= 0) {
                player.resetPlayer();
                output.append("Game over! You are back to room 0.");
            }
        }

        return output.toString();
    }
}
