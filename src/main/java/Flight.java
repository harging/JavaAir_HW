import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    Flight flight;
    ArrayList<CabinCrew> cabinCrew;
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departs;
    String departTime;
    int numberOfSeats;
    int numberOfPassengers;

    public Flight(Pilot pilot,
                  ArrayList<CabinCrew> cabinCrew,
                  ArrayList<Passenger> passengers,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departs,
                  String departTime) {
        this.pilot = pilot;
        this.cabinCrew = cabinCrew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departs = departs;
        this.departTime = departTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrew> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparts() {
        return departs;
    }

    public void setDeparts(String departs) {
        this.departs = departs;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public int getAvailableSeats() {
        numberOfSeats = plane.getCapacity();
        numberOfPassengers = passengers.size();
        return numberOfSeats - numberOfPassengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (this.getAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }
}
