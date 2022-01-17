public class FlightManager {

    private int aBag = 10;
    private Flight flight;
    private Plane plane;
    private int capacity;
    private int passengerTotal;

    public FlightManager(Flight flight, Plane plane, int capacity, int passengerTotal) {
        this.flight = flight;
        this.plane = plane;
        this.capacity = capacity;
        this.passengerTotal = passengerTotal;
    }

    public int getReservedWeight() {
       plane =  flight.getPlane();
       return plane.getWeight() / 2;
    }

    public int getBaggageWeight() {
        passengerTotal = flight.getPassengers().size();
        return passengerTotal * aBag;
    }

    public int getRemainingBaggageWeight() {
        return this.getReservedWeight() - this.getBaggageWeight();
    }
}
