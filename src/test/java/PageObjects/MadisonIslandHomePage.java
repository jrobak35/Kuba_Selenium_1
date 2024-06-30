package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MadisonIslandHomePage {
    private WebDriver driver;
    private WebElement accountLink;
    private WebElement myAccountOption;
    private WebElement myWishlistOption;
    private WebElement myCartOption;
    private WebElement checkoutOption;
    private WebElement registerOption;
    private WebElement logInOption;
    private WebElement languageDropdown;

    public MadisonIslandHomePage(WebDriver driver) {
        this.driver = driver;
        this.accountLink = driver.findElement(By.className("skip-account"));
        this.myAccountOption = driver.findElement(By.cssSelector("ul li [title = 'My Account']"));
        this.myWishlistOption = driver.findElement(By.cssSelector("[title = 'My Wishlist']"));
        this.myCartOption = driver.findElement(By.cssSelector("[title = 'My Cart']"));
        this.checkoutOption = driver.findElement(By.cssSelector("[title = 'Checkout']"));
        this.registerOption = driver.findElement(By.cssSelector("[title = 'Register']"));
        this.logInOption = driver.findElement(By.cssSelector("[title='Log In']"));
        this.languageDropdown = driver.findElement(By.id("select-language"));
    }
    public void open() {
        driver.get("http://demo-store.seleniumacademy.com/");
    }

    public void setLanguageToGerman() {
        languageDropdown.click();
        Select dropdown = new Select(languageDropdown);
        dropdown.selectByIndex(2);
    }


    public void selectMyAccount() {
        accountLink.click();
        myAccountOption.click();
    }
    public void selectMyWishlist() {
        accountLink.click();
        myWishlistOption.click();
    }
    public void selectMyCart() {
        accountLink.click();
        myCartOption.click();
    }
    public void selectCheckout() {
        accountLink.click();
        checkoutOption.click();
    }
    public void selectRegister() {
        accountLink.click();
        registerOption.click();
    }

    public void selectLogin() {
        accountLink.click();
        logInOption.click();
    }

    public void hoverOverAccountOptions() {
        Actions actions = new Actions(driver);
        accountLink.click();
        // Podświetlanie każdej opcji w menu konta
        actions.moveToElement(myAccountOption).perform();
        actions.moveToElement(myWishlistOption).perform();
        actions.moveToElement(myCartOption).perform();
        actions.moveToElement(checkoutOption).perform();
        actions.moveToElement(registerOption).perform();
        actions.moveToElement(logInOption).perform();
        accountLink.click();
    }
}

