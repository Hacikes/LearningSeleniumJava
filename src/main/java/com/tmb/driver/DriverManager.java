package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {

    }

    // Для многопоточной инициализации драйвера, чтобы найти нужный драйвер
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    // В данном методе возвращаем локальный поток вебдрайвера, чтобы он перезатирался при многопочном запуске тестов
    // Грубо говоря это ребёнок
    public static WebDriver getDriver() {
        return dr.get();
    }

    // Обозначаем, к кому объекту мы привязываем инициализированный драйвер
    // Опять же грубо говоря это родитель. Родителю нужно найти своего ребёнка
    public static void setDriver(WebDriver driverref) {
        dr.set(driverref);
    }

    // Удаление потока, после его завершения, чтобы не случилось утечки памяти
    public static void unload() {
        dr.remove();
    }
}
