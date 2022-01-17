public class CabinCrew extends AbstractPerson {

    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String safetyInstructions() {
        return "Buckle up, knuckleheads";
    }
}
