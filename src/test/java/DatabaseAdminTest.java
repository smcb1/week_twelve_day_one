import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Bill", "GY865432B", 18000);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Bill", databaseAdmin.getName());
    }

    @Test
    public void testCanGetNiNumber() {
        assertEquals("GY865432B", databaseAdmin.getNiNumber());
    }

    @Test
    public void testCanGetSalary() {
        assertEquals(18000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void testCanGetRaise() {
        assertEquals(20000, databaseAdmin.getRaise(2000), 0.01);
    }

    @Test
    public void testCanGetBonus() {
        assertEquals(180, databaseAdmin.payBonus(), 0.01);
    }
}
