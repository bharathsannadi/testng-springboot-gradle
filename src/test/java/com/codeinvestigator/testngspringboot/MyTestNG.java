package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestNG {

    @Test(groups = {"unittest"})
    void myfirstTest() throws InterruptedException {
        Assert.assertEquals("2", ((Integer)2).toString());
    }

}
