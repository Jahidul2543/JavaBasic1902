package collectionframeworkC15test;

import collectionframeworkC15.ArrayListDemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayListDemoTest {

    @Test
    public void findElementIndexBasedOnElementNameTest(){

        ArrayListDemo obj = new ArrayListDemo();
      int actualIndexNumber =  obj.findElementIndexBasedOnElementName("Ahad");

      int expectedIndexNumber = 3;

        Assert.assertEquals(actualIndexNumber,expectedIndexNumber );


    }
}
