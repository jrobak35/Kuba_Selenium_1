package Tests;

import PageObjects.MadisonIslandHomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageAccount {
    private static WebDriver driver;
    private static MadisonIslandHomePage madisonIslandHomePage;

    @BeforeAll
    public static void setUp() {
        // Path to driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/robak/IdeaProjects/Kuba_Selenium_1/chromedriver/chromedriver.exe");

        // Session's initialisation
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/");

        // Inicjalizacja obiektów Page Object
        madisonIslandHomePage = new MadisonIslandHomePage(driver);
    }

    @Test
    public void testGoToLoginPage() {
        // Akcja na stronie głównej prowadząca do strony logowania
        // madisonIslandHomePage = new MadisonIslandHomePage(driver);
        madisonIslandHomePage.selectLogin();
    }

    @Test
    public void testHoverOverAccountOptions() {
        madisonIslandHomePage.hoverOverAccountOptions();
    }


    @AfterAll
    public static void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}