import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void setup() {
        plane = new Plane("ScottishWings", PlaneType.AIRBUS320);
        passenger = new Passenger();
    }

    @Test
    public void hasAirline() {
        assertEquals("ScottishWings", plane.getAirline());
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.AIRBUS320, plane.getType());
    }

    @Test
    public void hasPassengerList() {
        assertEquals(0, plane.getPassengerList().size());
    }

    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void canRemovePassenger() {
        plane.addPassenger(passenger);
        plane.removePassenger();
        assertEquals(0, plane.getPassengerList().size());
    }
}
