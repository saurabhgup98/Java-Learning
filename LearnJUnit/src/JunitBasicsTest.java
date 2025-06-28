import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class JunitBasicsTest {
    @Test
    void test(){
//        fail("Not yet implemented");      // We can use this function to implement Fail case
//        Absence of Failure is Success => Hence If we remove above fail() fn,then test will pass else fail
//        We write here "Test Condition" also called as "Assert"
//        Hence we write asserts to check for Certain conditions and if any condition fail, test fails

    }

//    Let's Test Different Assets Methods
//    1. AssertsEqual => To Test if the "Expected Result and Result of Testing Function Equals
    @Test
    void calculateSum_nonNullArray(){
        Assertions.assertEquals(6, JunitBasics.calculateSum(new int[] {1,2,3}));
    }

    // Note: We can also Provide the "Error Msg to be displayed if Results Failed"
    @Test
    void calculateSum_nullMemberArray(){
        Assertions.assertEquals(0, JunitBasics.calculateSum(new int[] {}),"Error Message: Comparison Failed");
    }

    public static List<String> courses = Arrays.asList("AWS","Python","Java");
    public static String[] coursesArr = {"AWS","Python","Java"};

    //2. AssertTrue
    @Test
    void checkForTrueCondition(){
        Assertions.assertTrue(courses.contains("AWS"));
    }

//    3. AssertFalse
    @Test
    void checkForFalseCondition(){
        Assertions.assertFalse(courses.contains("PHP"),"Error Msg: Result should be false but came true");
    }

//    AssertsTrue and AssertFalse: Both can have a Error msg to display in case of failure

//    4. AssertNull & AssetsNotNull
    @Test
    void g() {
        Assertions.assertNotNull(courses,"Error Msg: Courses is null but result should be notNUll");
    }

//    5. AssertsArrayEqual
    @Test
    void compareTwoEqualArrays(){
        Assertions.assertArrayEquals(new String[] {"AWS","Python","Java"}, coursesArr);
    }

}