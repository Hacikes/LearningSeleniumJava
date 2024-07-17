package com.tmd.tests;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

// Расширил класс LoginPageTests методами из класса BaseTest
public class LoginPageTests extends BaseTest {

    private LoginPageTests() {
    }

    @Test
    public void test2() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
    }
}

