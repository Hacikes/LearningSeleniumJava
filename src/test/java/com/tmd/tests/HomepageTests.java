package com.tmd.tests;

import com.tmb.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.tmb.driver.Driver.driver;

public final class HomepageTests extends BaseTest{

    private HomepageTests(){

    }

    @Test
    public void test3() {
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
    }
}
