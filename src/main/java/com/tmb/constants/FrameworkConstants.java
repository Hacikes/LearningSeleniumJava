package com.tmb.constants;


public final class FrameworkConstants {
    // Конструктор
    private FrameworkConstants(){
    }

    // Вынесенный путь к веб драйверу
    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables//chromedriver.exe";

    // Getter
    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
}
