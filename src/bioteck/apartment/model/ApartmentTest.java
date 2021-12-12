package bioteck.apartment.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ApartmentTest {
	@Test
	public void testCreate() {
		ApartmentComplex complex = new ApartmentComplex("Complex #1", "75 Where are We Way");
		Apartment a = Apartment.create(complex, 1, 500, "2 Beds, 1 Bathroom");
		assertNotNull(a.getNumber(), "Apartment should be created");
		assertEquals(a.getRent(), 500);
		assertEquals(a.getComplex(), complex, "apartment has correct complex");
		assertEquals(a.getNumber(), 1, "Apartment has the expected number.");
		assertEquals(a.getApartmentDescription(), "2 Beds, 1 Bathroom");
	}
}
