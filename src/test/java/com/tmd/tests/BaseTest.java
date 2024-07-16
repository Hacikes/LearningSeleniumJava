package com.tmd.tests;

import com.tmb.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest(){

    }

    // Вынес предусловие, которое будет повторяться для всех тестов в данном файле
    @BeforeMethod
    public void setUp() {
        // Вызываем инициализацию драйвера открытие страницы
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        // Вызываем закрытие страницы
        Driver.quitDrover();
    }
}
