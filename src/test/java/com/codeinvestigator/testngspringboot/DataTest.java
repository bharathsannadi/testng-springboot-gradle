package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = {"data"})
public class DataTest {

    @DataProvider(name="math")
    Object[][] mathData(){
        return new Object[][]{{4},{10}};
    }

    @Test(dataProvider = "math")
    void doMath(Integer value){
        int result = value * 2;
        System.out.println(String.format("The value is %s and the result is %s", value, result));
        Assert.assertEquals(value*2, result);
    }
    
    @Test(dataProvider = "math2nd", dataProviderClass = DataProviderMath.class)
    void doMath2nd(Integer[] value){
        for (Integer val : value) {
            int result = val * 2;
            System.out.println(String.format("The value is %d and the result is %s", val, result));
            Assert.assertEquals(val*2, result);
        }
    }

}
