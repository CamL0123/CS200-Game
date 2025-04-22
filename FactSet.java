import java.util.ArrayList;
import java.util.List;

public class FactSet {
    public String A, B, C;
    public String[] truths;
    
    public FactSet(String A, String B, String C, String truth1, String truth2) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.truths = new String[]{truth1, truth2};
    }
    
    public static List<FactSet> getOwlFactSets() {
        List<FactSet> list = new ArrayList<>();
        list.add(new FactSet("Owls can rotate their heads 270°.", "Owls are mammals.", "Owls hunt at night.", "A", "C"));
        list.add(new FactSet("Owls have excellent vision.", "Owls can swim long distances.", "Owls regurgitate bones.", "A", "C"));
        list.add(new FactSet("Owls lay eggs.", "Owls build nests underground.", "Owls have asymmetrical ears.", "A", "C"));
        list.add(new FactSet("The Great Wall of China is visible from space.", "Water boils at a lower temperature at higher altitudes.", "Bananas are berries, but strawberries are not.", "B", "C"));
        list.add(new FactSet("Lightning can strike the same place twice.", "Humans share 98% of their DNA with chimpanzees.", "The Sahara Desert is the largest desert in the world.", "A", "B"));
        return list;
    }
}
