package com.tmb.driver;

import com.tmb.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver() {

    }

    // Инициализируем вебдрайвер в переменную
    private static WebDriver driver;


    public static void initDriver() {

        // Проверит, что драйвер = 0 и только после этого создаст нужный экземпляр
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath()); // Указываем путь к веб драйверу хрома, который вынесен в отдельный файл с константами
            driver = new ChromeDriver(); // Инициализируем объект веб драйвера

//            driver.manage().window().maximize(); // Отображает окно хрома при запуске теста в польностью открытом окне(на весь экран)
            DriverManager.setDriver(driver); // Запрашивание ребёнка/Нужного потока для нужного инициализированного драйвера
            DriverManager.getDriver().get("http://google.com"); // Инициализация драйвера, на котором будем запускать гугл
        }
    }

    public static void quitDrover() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            // Закрывает браузер
            DriverManager.getDriver().quit(); // Сначала получаем инициализированный драйвер
            DriverManager.unload(); // Затем удаляем все значения
        }
    }
}
