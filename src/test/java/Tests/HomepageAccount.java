package Tests;

import PageObjects.MadisonIslandHomePage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestMethodOrder(OrderAnnotation.class)
public class HomepageAccount {
    private static WebDriver driver;
    private static MadisonIslandHomePage madisonIslandHomePage;

    @BeforeAll
    public static void setUpClass() {
        // Path to driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/robak/IdeaProjects/Kuba_Selenium_1/chromedriver/chromedriver.exe");

        // Session's initialisation
        driver = new ChromeDriver();
    }
    @BeforeEach
    public void setUpTest() {
        driver.get("http://demo-store.seleniumacademy.com/");
        madisonIslandHomePage = new MadisonIslandHomePage(driver);
    }
        // Inicjalizacja obiektów Page Object
//        madisonIslandHomePage = new MadisonIslandHomePage(driver);

    @Test
    @Order(1)
    public void testHoverOverAccountOptions() throws InterruptedException {
        madisonIslandHomePage.hoverOverAccountOptions();
        Thread.sleep(2000);
    }

    @Test
    @Order(2)
    public void testThroughMyAccount() {
        madisonIslandHomePage.selectMyAccount();
    }

    @Test
    @Order(3)
    public void testThroughLoginPage() {
        madisonIslandHomePage.selectLogin();}

    @Test
    @Order(4)
    public void testThroughCheckout() {
        madisonIslandHomePage.selectCheckout();
    }

    @Test
    @Order(5)
    public void testThroughRegister() {
        madisonIslandHomePage.selectRegister();
    }

    @Test
    @Order(6)
    public void testThroughMyCart() {
        madisonIslandHomePage.selectMyCart();
    }

    @Test
    @Order(7)
    public void testThroughMyWishlist() {
        madisonIslandHomePage.selectMyWishlist();
    }

    @Test
    @Order(8)
    public void testSelectGermanLanguage() {
        madisonIslandHomePage.setLanguageToGerman();
    }


    @AfterAll
    public static void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}