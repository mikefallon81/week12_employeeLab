import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Harry", "JL998765A", 10000.00, "HR");
    }

    @Test
    public void managerHasName(){
        assertEquals("Harry", manager.getName());
    }


    @Test
    public void managerHasNINumber(){
        assertEquals("JL998765A", manager.getNi());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(10000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHAsDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void checkSalaryRaise(){
        manager.raiseSalary(100.00);
        assertEquals(10100.00, manager.getSalary(),0.01);
    }

    @Test
    public void checkSalaryRaisePositiveNumber(){
        manager.raiseSalary(-1.00);
        assertEquals(10000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void checkPayBonus(){
        assertEquals(100, manager.payBonus(), 0.01);
    }

    @Test
    public void checkNameChangeNotNull(){
        manager.setName("");
        assertEquals("Harry", manager.getName());
    }


}
