package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {

    public static void main(String[] args) {

        RemoteWebDriver driver = new ChromeDriver(new ChromeOptions());

        driver.get("https://www.selenium.dev/selenium/web/blank.html");

        driver.close();
        driver.quit();

        System.out.println("Successfully launched browser and quit");
    }
}