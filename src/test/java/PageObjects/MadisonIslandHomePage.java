package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MadisonIslandHomePage {
    private WebDriver driver;
    private WebElement accountLink;
    private WebElement logInOption;

    public MadisonIslandHomePage(WebDriver driver) {

        this.driver = driver;
        this.accountLink = driver.findElement(By.className("skip-account"));
        this.logInOption = driver.findElement(By.cssSelector("[title='Log In']"));

    }
    public void open() {
        driver.get("http://demo-store.seleniumacademy.com/");
    }

    public void selectLogin() {
        accountLink.click();
        logInOption.click();
    }
}
