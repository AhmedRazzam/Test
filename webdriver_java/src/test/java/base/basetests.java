package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class basetests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
