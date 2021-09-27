import org.junit.*;

import static org.junit.Assert.*;


public class HouseCatTest {
    HouseCat c;

    @Before
    public void setUp() throws Exception {
        c = new HouseCat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Angry Cat Noises", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(11, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(9, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, c.getPrice());
    }
}