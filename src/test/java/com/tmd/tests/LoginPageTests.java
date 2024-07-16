package com.tmd.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.tmb.driver.Driver.driver;

// Расширил класс LoginPageTests методами из класса BaseTest
public class LoginPageTests extends BaseTest{

    private LoginPageTests(){

    }

    // Временно закомментил
//    @Test
//    public void test1() {
//        // Находит поиск и вбивает в него слово Automation и нажимает Enter
//        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
//    }

    @Test
    public void test2() {
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
    }
}

