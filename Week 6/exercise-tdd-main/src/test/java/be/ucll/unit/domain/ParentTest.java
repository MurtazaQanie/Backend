package be.ucll.unit.domain;
import be.ucll.domain.Parent;
import be.ucll.domain.Student;
import be.ucll.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ParentTest extends UserTest {
        private String name;
        private int age;
        private String email;
        private String studies;
        private int maxChildern;




        @BeforeEach
        public void setUp(){
            name = "Murtaza";
            age = 22;
            email = "murtaza.qanie.1@gmail.com";
            studies = "Computer Science";
            maxChildern = 3;
        }





        @Test
        void givenValidParent_WhenAddingChildern_ThenPartentCreatedWithNumberOfChildern(){
            Parent parent= new Parent(name,age,email,maxChildern);
            User child1 = new User("Sometjing", 10);
            User child2 = new User("Sometjing2", 11);
            User child3 = new User("Sometjing3", 12);



                parent.addChild(child1);
                parent.addChild(child2);
                parent.addChild(child3);

                assertEquals(3, parent.getChildren().size());
                assertTrue(parent.getChildren().contains(child1));
                assertTrue(parent.getChildren().contains(child2));
                assertTrue(parent.getChildren().contains(child3));

        }

        @Test
        void givenValidParent_WhenNegativeAgedChild_ThenThrowsRunTimeExceptionError(){
            assertThrows(RuntimeException.class, ()->new Parent(name, age, email, -4));

        }

        @Test
        void givenValidParent_whenMaximumChildernisZero_thenThrowsRunTimeException(){
            assertThrows(RuntimeException.class, ()->new Parent(name, age, email, 0));
        }

        @Test
        void givenValidParent_whenAddingOneChild_thenChildAdded(){
            Parent parent= new Parent(name,age,email,maxChildern);
            User child1 = new User("Sometjing", 10);

            parent.addChild(child1);

            assertEquals(1, parent.getChildren().size());
            assertTrue(parent.getChildren().contains(child1));

        }

        @Test
        void givenValidPartent_whenAddingMoreThanMaxmimumChilder_thenThrowsException(){
            Parent parent= new Parent(name,age,email,3);
            User child1 = new User("Sometjing", 10);
            User child2 = new User("Sometjing", 10);
            User child3 = new User("Sometjing", 10);
            User child4 = new User("Sometjing", 10);


            parent.addChild(child1);
            parent.addChild(child3);
            parent.addChild(child2);



            assertThrows(RuntimeException.class, ()->parent.addChild(child4));


        }


}
