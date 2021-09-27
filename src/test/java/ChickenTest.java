import org.junit.*;

import static org.junit.Assert.*;


public class ChickenTest {
    Chicken c;

    @Before
    public void setUp() throws Exception {
        c =
                new Chicken();

    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bawk!", c.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(7, c.getPrice());
    }


}
