import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Mike", "A1", 100.00);
    }

    @Test
    public void checkName(){
        assertEquals("Mike", databaseAdmin.getName());
    }

    @Test
    public void checkNi(){
        assertEquals("A1", databaseAdmin.getNi());
    }

    @Test
    public void checkSalary(){
        assertEquals(100.00, databaseAdmin.getSalary(), 0.01);
    }


}
