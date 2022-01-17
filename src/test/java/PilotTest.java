import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Frank", Rank.CAPTAIN, "P001");
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("P001", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("Woosh!", pilot.flyThePlane());
    }
}