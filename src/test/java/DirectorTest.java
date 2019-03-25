import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Kim", "JK854690K", 100000, "BoD",  500000);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Kim", director.getName());
    }

    @Test
    public void testCanGetNiNumber() {
        assertEquals("JK854690K", director.niNumber);
    }

    @Test
    public void testCanGetSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void testCanGetDepartment() {
        assertEquals("BoD", director.getDeptName());
    }

    @Test
    public void testCanGetBudget() {
        assertEquals(500000, director.getBudget(), 0.01);
    }

    @Test
    public void testCanGetRaiseSuccess() {
        assertEquals(115000, director.getRaise(15000), 0.01);
    }

    @Test
    public void testCanGetRaiseFail() {
        assertEquals(0, director.getRaise(0), 0.01);
    }

    @Test
    public void testCanGetBonus() {
        assertEquals(2000, director.payBonus(), 0.01);
    }

    @Test
    public void testCanAddName() {
        director.addName(" ");
        assertEquals("Tim", director.getName());

    }
}
