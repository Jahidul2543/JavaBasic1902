package calculationtest;

import calculation.ScientificCalculatorHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScientificCalculatorHelperTest {

 @Test
 public void addTest(){
     ScientificCalculatorHelper obj = new ScientificCalculatorHelper();
     int actualResult = obj.add(2,2);
     System.out.println(actualResult);
     int expectedResults = 4;
     Assert.assertEquals(actualResult, expectedResults);
     System.out.println("Test Passed");

 }

    @Test
    public void divideTest(){
        ScientificCalculatorHelper obj = new ScientificCalculatorHelper();
        int actualResult = obj.divide(2,2);
        System.out.println(actualResult);
        int expectedResults = 1;
        Assert.assertEquals(actualResult, expectedResults);
        System.out.println("Test Passed");

    }

}
