package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = {"integration"})
public class IntegrationTests {

    @Test(priority = 2)
    void integrationTest1(){
        assertEquals(2,2);
    }

    @Test(priority = 3, dependsOnGroups = {"smoketest"},alwaysRun = true, dependsOnMethods = {"integrationTest3"})
    void integrationTest2(){
        assertEquals(2,2);
    }

    @Test(priority = 1)
    void integrationTest3(){
        assertEquals(2,2);
    }
}
