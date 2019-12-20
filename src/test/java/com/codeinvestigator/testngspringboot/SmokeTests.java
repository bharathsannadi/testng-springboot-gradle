package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"smoketest"})
public class SmokeTests {

    @Test(groups = {"logic"}, dependsOnGroups = {"unittest"})
    void myfirstTest() throws InterruptedException {
        Assert.assertEquals("2", ((Integer)2).toString());
    }

}
