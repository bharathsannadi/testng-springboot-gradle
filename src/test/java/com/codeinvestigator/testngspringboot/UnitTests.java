package com.codeinvestigator.testngspringboot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = {"unittest"})
public class UnitTests {

    @Test
    void myUnittest1(){
        assertEquals(2,2);
    }

    @Test
    void myUnittest2(){
        assertEquals(4,4);
    }

    @Test
    void myUnittest3(){
        assertEquals(6,6);
    }


}
