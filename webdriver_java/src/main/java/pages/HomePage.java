package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public RegisterPage clickCreateAccount () {
        clickLink();
        return new RegisterPage(driver);
    }




    private  void clickLink(){
        driver.findElement(By.linkText("Create an Account")).click();

    }

}
