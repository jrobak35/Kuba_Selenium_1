package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private WebElement emailAddress;
    private WebElement passwordInput;
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.emailAddress = driver.findElement(By.name("login[username]"));
        this.passwordInput = driver.findElement(By.name("login[password]"));
        this.loginButton = driver.findElement(By.id("send2"));
    }
    public void open() {
        driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");
    }

    public void checkTitle() {
        assert driver.getTitle().equals("Customer Login");
    }
    public void login(String username, String password) {
        emailAddress.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
