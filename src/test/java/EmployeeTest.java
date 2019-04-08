import com.example.codeclan.lab_spring_employee.models.Employee;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Before
    public void before()  {
        employee = new Employee("John Doe", 30, 1234567, "jdoe@email.com");
    }


    @Test
    public void testGetName() {
        assertEquals("John Doe", employee.getName());

    }

    @Test
    public void testSetName() {
        employee.setName("Janet Doe");
        assertEquals("Janet Doe", employee.getName());

    }

    @Test
    public void testGetAge() {
        assertEquals(30, employee.getAge());
    }

    @Test
    public void testSetAge() {
        employee.setAge(29);
        assertEquals(29, employee.getAge());
    }

    @Test
    public void testGetEmployeeNumber() {
        assertEquals(1234567, employee.getEmployeeNumber());
    }

    @Test
    public void testSetEmployeeNumber() {
        employee.setEmployeeNumber(9999999);
        assertEquals(9999999, employee.getEmployeeNumber());
    }

    @Test
    public void testGetEmail() {
        assertEquals("jdoe@email.com", employee.getEmail());
    }

    @Test
    public void testSetEmail() {
        employee.setEmail("joedoe@coldmail.com");
        assertEquals("joedoe@coldmail.com", employee.getEmail());
    }


} 
