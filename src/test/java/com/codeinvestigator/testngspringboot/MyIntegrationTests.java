package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = {"integration"})
public class MyIntegrationTests {

    @Test
    void integrationTest1(){
        assertEquals(2,2);
    }

    @Test(groups={"broken"})
    void integrationTest2(){
        assertEquals(2,2);
    }

    @Test
    void integrationTest3(){
        assertEquals(2,2);
    }
}
