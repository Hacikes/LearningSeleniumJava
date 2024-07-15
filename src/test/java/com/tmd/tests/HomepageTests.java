package com.tmd.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTest{

    @Test
    public void test3() {
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
    }
}
