import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testFromLabelPrintemps() {
		Saison printemps = Saison.fromLabel("Printemps");
		assertEquals(Saison.PRINTEMPS, printemps);
	}
	
	@Test
	public void testFromLabelUnknown() {
		Saison unknown = Saison.fromLabel("Unknown");
		assertNull(unknown);
	}
	
	@Test
	public void testFromLabelNull() {
		Saison saisonNull = Saison.fromLabel(null);
		assertNull(saisonNull);
	}

}
