import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AirportTest {
	@DisplayName("Given there is an economy flight")
	@Nested
	class EconomyFlightTest {
		private Flight economyFlight;
		@BeforeEach
		void setUp() {
			economyFlight = new EconomyFlight("1");
		}
		
		@Test
		public void testEconomyFlightRegularPassenger() {
			Passenger mike = new Passenger("Mike", false);
			assertEquals("1", economyFlight.getId());
			assertEquals(true, economyFlight.addPassenger(mike));
			assertEquals(1, economyFlight.getPassengersList().size());
			assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());
			assertEquals(true, economyFlight.removePassenger(mike));
			assertEquals(0, economyFlight.getPassengersList().size());
		}
	}
	
	@DisplayName("Given there is an business flight")
	@Nested
	class BusinessFlightTest {
		private Flight businessFlight;
		@BeforeEach
		void setUp() {
			businessFlight = new EconomyFlight("1");
		}
		
		@Test
		public void testBusinessFlightVipPassenger() {
			Passenger james = new Passenger("James", true);
			assertEquals("1", businessFlight.getId());
			assertEquals(true, businessFlight.addPassenger(james));
			assertEquals(1, businessFlight.getPassengersList().size());
			assertEquals("James", businessFlight.getPassengersList().get(0).getName());
			assertEquals(false, businessFlight.removePassenger(james));
			assertEquals(1, businessFlight.getPassengersList().size());
		}
	}
}