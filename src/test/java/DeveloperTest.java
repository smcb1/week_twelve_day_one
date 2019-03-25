import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Jim", "GH765231K", 20000, "Development");
    }

    @Test
    public void testCanGetName() {
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void testCanGetNiNumber() {
        assertEquals("GH765231K", developer.getNiNumber());
    }

    @Test
    public void testCanGetSalary() {
        assertEquals(20000, developer.getSalary(), 0.01);
    }

    @Test
    public void testCanGetRaise() {
        developer.getRaise(2000);
        assertEquals(22000, developer.getSalary(), 0.01);
    }

    @Test
    public void testCanGetBonus() {
        assertEquals(200, developer.payBonus(), 0.01);
    }

}
