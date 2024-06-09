package Tests;

import PageObjects.LoginPage;
import PageObjects.MadisonIslandHomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailedTest {
    private static WebDriver driver;
    private static MadisonIslandHomePage madisonIslandHomePage;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp() {
        // Inicjalizacja WebDriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/robak/IdeaProjects/Kuba_Selenium_1/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        // Inicjalizacja obiektów Page Object
        madisonIslandHomePage = new MadisonIslandHomePage(driver);
        loginPage = new LoginPage(driver);

        // Otwórz stronę główną
        madisonIslandHomePage.open();
    }

    @Test
    public void testGoToLoginPage() {
        // Akcja na stronie głównej prowadząca do strony logowania
        madisonIslandHomePage.selectLogin();
    }

    @AfterAll
    public static void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}