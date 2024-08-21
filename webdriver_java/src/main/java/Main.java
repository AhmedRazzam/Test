

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://magento.softwaretestingboard.com/");


            driver.manage().window().maximize();


            Actions actions = new Actions(driver);


            WebElement hotSellersSection = driver.findElement(By.cssSelector("a[href*='hot-sellers']"));


            actions.moveToElement(hotSellersSection).perform();


            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            List<WebElement> hotSellersItems = driver.findElements(By.cssSelector(".products-grid .product-item"));


            if (hotSellersItems.size() >= 2) {

                WebElement firstItem = hotSellersItems.get(0).findElement(By.cssSelector(".action.tocart"));
                firstItem.click();


                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                WebElement secondItem = hotSellersItems.get(1).findElement(By.cssSelector(".action.tocart"));
                secondItem.click();
            } else {
                System.out.println("Not enough hot sellers items found!");
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //driver.quit();
        }
    }
}
