import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BandTest {

    @Test
    public void testPrintBand() {
        Band band1 = new Band("Strapping Young Lad", "Metal", true);
        assert band1.Active = true;
    }
}