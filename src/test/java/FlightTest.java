import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    ArrayList<CabinCrew> cabinCrew = new ArrayList<>();
    ArrayList<Passenger> passengers = new ArrayList<>();
    Plane plane;
    String flightNumber;
    String destination;
    String departs;
    String departTime;
    CabinCrew firstOfficer;
    CabinCrew flightAttendant;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        pilot = new Pilot("Anne", Rank.CAPTAIN, "P002");
        firstOfficer = new CabinCrew("Phil", Rank.FIRST_OFFICER);
        flightAttendant = new CabinCrew("Lance", Rank.FLIGHT_ATTENDANT);
        cabinCrew.add(firstOfficer);
        cabinCrew.add(flightAttendant);
        passenger1 = new Passenger("James", 1);
        passenger2 = new Passenger("David", 3);
        passenger3 = new Passenger("Lou", 0);
        passengers.add(passenger1);
        passengers.add(passenger2);
        plane = Plane.TWINOTTER;
        flightNumber = "LM455";
        destination = "BRR";
        departs = "GLA";
        departTime = "1130";
        flight = new Flight(pilot, cabinCrew, passengers, plane, flightNumber, destination, departs, departTime);
    }

    @Test
    public void hasPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasCabinCrew() {
        assertEquals(cabinCrew, flight.getCabinCrew());
    }

    @Test
    public void hasPassengers() {
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(flightNumber, flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals(destination, flight.getDestination());
    }

    @Test
    public void hasDeparts() {
        assertEquals(departs, flight.getDeparts());
    }

    @Test
    public void hasDepartTime() {
        assertEquals(departTime, flight.getDepartTime());
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(8, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger3);
        assertEquals(3, passengers.size());
    }
}