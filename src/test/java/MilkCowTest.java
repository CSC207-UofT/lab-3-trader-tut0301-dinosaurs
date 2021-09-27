import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    MilkCow c;

    @Before
    public void setUp() throws Exception {
        c = new MilkCow();
    }

    @Test(timeout = 50)
    public void TestMilkVolume() {
        assertEquals(6, c.MilkVolume());
    }
    
    @Test(timeout = 50)
    public void TestSound() {
        asserEquals("Moo", c.Sound());
    }
    
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, c.getPrice());
    }

}
