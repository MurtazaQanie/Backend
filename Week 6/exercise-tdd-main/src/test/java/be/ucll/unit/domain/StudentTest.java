package be.ucll.unit.domain;
import be.ucll.domain.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest extends UserTest {
    private String name;
    private int age;
    private String email;
    private String studies;



    @BeforeEach
    public void setUp(){
        name = "Murtaza";
        age = 22;
        email = "murtaza.qanie.1@gmail.com";
        studies = "Computer Science";
    }


//     //constructor
//     //happy case
    @Test
    void givenValidStudent_WhenCreatingStudent_ThenStudentIsCreatedWithValidValues(){
        Student murtaza= new Student(name,age,email,studies);
        assertNotNull(name);
        assertEquals(name,murtaza.getName());
        assertEquals(age, murtaza.getAge());
        assertEquals(email, murtaza.getEmail());
        assertEquals(studies,murtaza.getStudies());
    }
    //     //constructor
//     //unhappy case
//     //invalid negative age

    @Test
    void givenInvalidStudies_WhenCreatingStudent_ThenRuntimeError(){
        Exception ex = assertThrows(RuntimeException.class, ()-> new Student(name,age, email, ""));
            assertEquals("Studies must be non-empty string", ex.getMessage());
        Exception ex2 = assertThrows(RuntimeException.class, ()-> new Student(name,age, email, null));
        assertEquals("Studies must be non-empty string", ex.getMessage());

    }


    @Test
    void givenValidStident_whenCallingString_thenCorrectionFormatIsWritten(){
        Student murtaza= new Student(name, age,email,studies);
        String result = murtaza.toString();
        assertEquals("User Murtaza(murtaza.qanie.1@gmail.com) is 22 years old.; Studies: Computer Science", result);
    }
}
