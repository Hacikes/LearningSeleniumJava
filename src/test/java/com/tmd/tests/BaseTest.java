package com.tmd.tests;

import com.tmb.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    // Инициализируем вебдрайвер в переменную
    WebDriver driver;

    // Вынес предусловие, которое будет повторяться для всех тестов в данном файле
    @BeforeMethod
    public void setUp() {
        // Указываем путь к веб драйверу хрома, который вынесен в отдельный файл с константами
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        // Инициализируем объект веб драйвера
        driver = new ChromeDriver();
        // Отображает окно хрома при запуске теста в польностью открытом окне(на весь экран)
        driver.manage().window().maximize();
        // Переходит на указанную страницу
        driver.get("http://google.com");
    }

    @AfterMethod
    public void tearDown() {
        // Закрывает браузер
        driver.quit();
    }
}
