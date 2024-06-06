package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MadisonIslandHomePage {
    private WebDriver driver;
    private By accountLink = By.className("skip-account");
    private By logInOption = By.cssSelector("[title='Log In']");

    public MadisonIslandHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("http://demo-store.seleniumacademy.com/");
    }

    public void selectLogin() {
        WebElement account = driver.findElement(accountLink);
        account.click();
        WebElement logIn = driver.findElement(logInOption);
        logIn.click();
    }
}
