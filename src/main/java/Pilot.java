public class Pilot extends CabinCrew {

    private final String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyThePlane() {
        return "Woosh!";
    }
}
