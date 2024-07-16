package com.tmb.driver;

import com.tmb.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    // Инициализируем вебдрайвер в переменную
    public static WebDriver driver;

    public static void initDriver() {

        // Проверит, что драйвер = 0 и только после этого создаст нужный экземпляр
        if (Objects.isNull(driver)) {
            // Указываем путь к веб драйверу хрома, который вынесен в отдельный файл с константами
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            // Инициализируем объект веб драйвера
            driver = new ChromeDriver();
            // Отображает окно хрома при запуске теста в польностью открытом окне(на весь экран)
            driver.manage().window().maximize();
            // Переходит на указанную страницу
            driver.get("http://google.com");
        }
    }

    public static void quitDrover() {
        if (Objects.isNull(driver)) {
            // Закрывает браузер
            driver.quit();
            driver=null; // Чтобы при следующем прогоне драйвер не был уже инициализирован в случае проблемы
        }
    }
}
