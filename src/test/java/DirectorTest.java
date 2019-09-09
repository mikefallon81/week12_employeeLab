import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Mike", "A1", 100.00, "IT", 300.00);
    }

    @Test
    public void checkName(){
        assertEquals("Mike", director.getName());
    }

    @Test
    public void checkNi(){
        assertEquals("A1", director.getNi());
    }

    @Test
    public void checkSalary(){
        assertEquals(100.00, director.getSalary(), 0.01);
    }

    @Test
    public void checkDeptName(){
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void checkBudget(){
        assertEquals(300.00, director.getBudget(), 0.01);
    }

    @Test
    public void checkBonus(){
        assertEquals(2.00, director.payBonus(), 0.01);
    }

}
