import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person matias = new Person(3123, 23, "matias", "perez", "doctor");
    Person maria = new Person(3127, 25, "maria", "martinez", "nurse");


    Person armando = (Person) matias.clone();

    PersonTest() throws PersonAgeException, CloneNotSupportedException, NameException {
    }

    @Test
    void getId()  {
        assertEquals(3232, matias.getId());
    }

    @Test
    void getName(){
        assertEquals("maria martinez", maria.getName());
    }

    @Test
    void getAge() {
        assertEquals(25, matias.getAge());
    }

    @Test
    void getOccupation() {
        assertEquals("nurse", maria.getOccupation());
    }

    @Test
    void testClones() {
        assertEquals(matias.getName(), armando.getName());
    }
}


