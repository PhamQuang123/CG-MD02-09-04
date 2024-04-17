package test;

import org.testng.annotations.Test;
import tdd.NextDayCaculator;

import static org.testng.AssertJUnit.assertEquals;

public class NextDayCaculatorTest {
    @Test
    public void testCase01(){
        int day = 0;
         int month = 0;
         int year = 2024;

         String expected = "Data error";
        NextDayCaculator nextDayCaculator = new NextDayCaculator();
        String actual = nextDayCaculator.getDataTest(day, month, year);
        assertEquals(expected, actual);
    }
}
