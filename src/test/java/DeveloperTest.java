import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void setup(){
            developer = new Developer("Mike", "A1", 100.00);
        }

        @Test
        public void checkName(){
            assertEquals("Mike", developer.getName());
        }

        @Test
        public void checkNi(){
            assertEquals("A1", developer.getNi());
        }

        @Test
        public void checkSalary(){
            assertEquals(100.00, developer.getSalary(), 0.01);
        }


    }
