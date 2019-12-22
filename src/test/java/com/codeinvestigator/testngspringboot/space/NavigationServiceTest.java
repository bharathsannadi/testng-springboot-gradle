package com.codeinvestigator.testngspringboot.space;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Test(groups={"spring"})
class NavigationServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    NavigationService navigationService;

    @Test
    void destination() {
        Assert.assertEquals("Mars",navigationService.destination());
    }
}