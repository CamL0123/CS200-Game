public class FactSet {
    public String A, B, C;
    public String[] truths;

    public FactSet(String A, String B, String C, String truth1, String truth2) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.truths = new String[]{truth1, truth2};
    }
}
