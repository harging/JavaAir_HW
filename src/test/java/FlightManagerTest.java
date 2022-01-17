import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

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
    FlightManager flightManager;

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
        flightManager = new FlightManager(flight, plane, 20,2);
    }

    @Test
    public void hasReservedWeight() {
        assertEquals(100, flightManager.getReservedWeight());
    }

    @Test
    public void hasBaggageWeight() {
        assertEquals(20, flightManager.getBaggageWeight());
    }

    @Test
    public void hasRemainingBaggageWeight() {
        assertEquals(80, flightManager.getRemainingBaggageWeight());
    }
}