package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/");
        driver.manage().window().maximize();
        System.out.println("Adres strony to "+ driver.getCurrentUrl());
        System.out.println("tytuł strony to " + driver.getTitle());
        WebElement account = driver.findElement(By.className("skip-account"));
        account.click();
        driver.quit();
    }
}
