package com.tmd.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginPageTests {

    public void test1() {
        // Указываем путь к веб драйверу хрома
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables//chromedriver.exe");
        // Инициализируем объект веб драйвера
        WebDriver driver = new ChromeDriver();
        // Отображает окно хрома при запуске теста в польностью открытом окне(на весь экран)
        driver.manage().window().maximize();
        // Переходит на указанную страницу
        driver.get("http://google.com");
        // Находит поиск и вбивает в него слово Automation и нажимает Enter
        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
        // Закрывает браузер
        driver.quit();
    }

    public void test2() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        driver.quit();
    }
}
