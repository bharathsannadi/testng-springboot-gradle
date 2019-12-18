package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestNG {

    @Test(groups = {"unittest", "smoke", "broken"}, timeOut = 2000)
    void myfirstTest() throws InterruptedException {
        Assert.assertEquals("2", ((Integer)2).toString());
        Thread.sleep(5000);
    }

}
