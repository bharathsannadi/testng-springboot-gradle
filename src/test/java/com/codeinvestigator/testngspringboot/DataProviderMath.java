package com.codeinvestigator.testngspringboot;

import org.testng.annotations.DataProvider;

public class DataProviderMath {

    @DataProvider(name="math2nd")
    Object[][] mathData2nd(){
        return new Object[][]{{4,8,12,16},{100,200,250,300,2000}};
    }
}
