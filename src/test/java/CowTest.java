import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestMilkVolume() {
        assertEquals(6, c.MilkVolume());
    }
