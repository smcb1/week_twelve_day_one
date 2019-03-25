import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Bob", "JB776432F", 22000, "Computing");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JB776432F", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(22000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Computing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(22220, manager.getRaise(220), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(220, manager.payBonus(), 0.01);
    }

}
